package com.ac.springcloud.service;

import com.ac.springcloud.common.CommonResult;
import com.ac.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author acemma
 * @Date 2021/12/2 17:10
 * @Description
 */

@FeignClient(value = "nacos-payment-provider", fallback = PaymentServiceFallback.class)
public interface PaymentService {

    @GetMapping(value = "/payment/{id}")
    CommonResult<Payment> payment(@PathVariable("id") Long id);
}
