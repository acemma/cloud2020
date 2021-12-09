package com.ac.springcloud.service.impl;

import com.ac.springcloud.dao.PaymentDao;
import com.ac.springcloud.entity.Payment;
import com.ac.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author acemma
 * @Date 2021/11/9 14:56
 * @Description
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getById(Long id) {
        return paymentDao.getById(id);
    }
}
