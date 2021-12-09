package com.ac.springcloud.service;

import com.ac.springcloud.entity.Payment;

/**
 * @Author acemma
 * @Date 2021/11/9 17:32
 * @Description
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getById(Long id);
}
