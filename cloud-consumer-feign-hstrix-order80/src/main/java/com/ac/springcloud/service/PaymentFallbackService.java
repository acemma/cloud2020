package com.ac.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author acemma
 * @Date 2021/11/11 9:29
 * @Description
 */

@Component
public class PaymentFallbackService implements PaymentHystrixService{


    @Override
    public String paymentInfoOk(Integer id) {
        return "PaymentFallbackService fall back, paymentInfoOk";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "PaymentFallbackService fall back, paymentInfoTimeout";
    }
}
