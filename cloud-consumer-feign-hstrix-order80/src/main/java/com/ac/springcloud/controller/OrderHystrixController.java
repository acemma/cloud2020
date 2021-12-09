package com.ac.springcloud.controller;

import com.ac.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author acemma
 * @Date 2021/11/10 16:24
 * @Description
 */

@RestController
@DefaultProperties(defaultFallback = "paymentGlobalFallback") // 统一异常处理fallback
public class OrderHystrixController {

    @Autowired
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id) {
        return paymentHystrixService.paymentInfoOk(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallBackMethod", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @HystrixCommand
    public String paymentInfoTimeout(@PathVariable("id") Integer id) {
        int age = 10 / 0;
        return paymentHystrixService.paymentInfoTimeout(id);
    }

    public String paymentTimeOutFallBackMethod(@PathVariable("id")Integer id) {
        return "我是消费者80，对方支付系统繁忙或请检查自己是否有错误，请10秒钟后重试！！";
    }

    // 下面是全局fallback
    public String paymentGlobalFallback() {
        return "全局异常信息处理，请稍后重试";
    }
}
