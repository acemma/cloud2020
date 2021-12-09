package com.ac.springcloud.controller;

import com.ac.springcloud.common.CommonResult;
import com.ac.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author acemma
 * @Date 2021/12/2 16:22
 * @Description
 */

@RestController
public class PaymentController {

    @Value("${server.port}")
    String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L, new Payment(1L, "A001"));
        hashMap.put(2L, new Payment(2L, "A002"));
        hashMap.put(3L, new Payment(3L, "A003"));
    }

    @GetMapping(value = "/payment/{id}")
    public CommonResult<Payment> payment(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200, "server port:" + serverPort, payment);
        return result;
    }
}
