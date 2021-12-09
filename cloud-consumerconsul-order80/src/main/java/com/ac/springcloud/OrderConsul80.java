package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author acemma
 * @Date 2021/11/10 11:18
 * @Description
 */

@EnableDiscoveryClient
@SpringBootApplication
public class OrderConsul80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsul80.class, args);
    }
}
