package com.ac.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author acemma
 * @Date 2021/11/10 10:29
 * @Description
 */

@Slf4j
@RestController
public class OrderZkController {


    public static final String PAYMENT_URL =  "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }


}
