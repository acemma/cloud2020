package com.ac.springcloud.controller;

import com.ac.springcloud.common.CommonResult;
import com.ac.springcloud.entity.Payment;
import com.ac.springcloud.service.PaymentService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author acemma
 * @Date 2021/12/2 16:37
 * @Description
 */

@Slf4j
@RestController
public class CircleBreakerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-user-service}")
    private String serverUrl;

//    @SentinelResource(value = "fallback", fallback = "handlerFallback") // 生效
//    @SentinelResource(value = "fallback", blockHandler = "blockHandler") // 生效
//    @SentinelResource(value = "fallback", blockHandler = "blockHandler", fallback = "handlerFallback") // 生效
    @SentinelResource(value = "fallback", blockHandler = "blockHandler", fallback = "handlerFallback",
    exceptionsToIgnore = {IllegalArgumentException.class}) // 忽略异常
    @GetMapping(value = "/consumer/fallback/{id}")
    public CommonResult<Payment> fallback(@PathVariable("id") Long id) {

        CommonResult<Payment> result = restTemplate.getForObject(serverUrl + "/payment/" + id, CommonResult.class);
        if (id == 4) {
            throw new IllegalArgumentException("非法参数");
        }
        if (result.getData() == null) {
            throw new NullPointerException("找不到对应记录");
        }
        return result;
    }

    public CommonResult handlerFallback(@PathVariable("id") Long id, Throwable e) {
        Payment payment = new Payment(id, "null");
        return new CommonResult(444, "fallback方法异常：" + e.toString(), payment);
    }

    public CommonResult blockHandler(@PathVariable("id") Long id, BlockException e) {
        Payment payment = new Payment(id, "null");
        return new CommonResult(445, "from blockHandler：" + e.toString(), payment);
    }


    //###########openfeign
    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/payment/{id}")
    public CommonResult<Payment> payment(@PathVariable("id") Long id) {
        return paymentService.payment(id);
    }
}
