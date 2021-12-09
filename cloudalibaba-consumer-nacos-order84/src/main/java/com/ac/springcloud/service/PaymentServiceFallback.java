package com.ac.springcloud.service;

import com.ac.springcloud.common.CommonResult;
import com.ac.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author acemma
 * @Date 2021/12/2 17:12
 * @Description
 */
@Component
public class PaymentServiceFallback implements PaymentService{
    @Override
    public CommonResult<Payment> payment(Long id) {
        return new CommonResult<>(446, "服务降级返回", new Payment(id, "没有该id数据"));
    }
}
