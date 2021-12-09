package com.ac.springcloud.controller;

import com.ac.springcloud.common.CommonResult;
import com.ac.springcloud.entity.Payment;
import com.ac.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author acemma
 * @Date 2021/11/10 15:16
 * @Description
 */

@RestController
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        return paymentFeignService.getById(id);
    }
}
