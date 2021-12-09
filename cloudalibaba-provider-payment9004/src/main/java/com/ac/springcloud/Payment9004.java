package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author acemma
 * @Date 2021/12/2 16:31
 * @Description
 */

@EnableDiscoveryClient
@SpringBootApplication
public class Payment9004 {

    public static void main(String[] args) {
        SpringApplication.run(Payment9004.class, args);
    }
}
