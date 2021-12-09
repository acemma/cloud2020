package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author acemma
 * @Date 2021/11/10 10:27
 * @Description
 */

@EnableDiscoveryClient
@SpringBootApplication
public class OrderZk80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZk80.class, args);
    }


}
