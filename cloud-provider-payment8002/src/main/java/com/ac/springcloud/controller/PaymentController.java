package com.ac.springcloud.controller;

import com.ac.springcloud.common.CommonResult;
import com.ac.springcloud.entity.Payment;
import com.ac.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author acemma
 * @Date 2021/11/9 14:58
 * @Description
 */

@Slf4j
@RequestMapping(value = "/payment")
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;


    @PostMapping(value = "/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果：{}", result);
        if (result > 0) {
            return new CommonResult<>(200, "插入数据成功, serverPort:" + serverPort, result);
        } else {
            return new CommonResult<>(500, "插入数据失败");
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getById(id);
        if (null != payment) {
            return new CommonResult<>(200, "查询成功, serverPort:" + serverPort, payment);
        } else {
            return new CommonResult<>(400, "没有查询记录，id=" + id);
        }
    }

    @GetMapping(value = "/lb")
    public String paymentLB() {
        return serverPort;
    }

}
