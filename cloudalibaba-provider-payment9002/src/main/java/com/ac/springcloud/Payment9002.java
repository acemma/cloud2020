package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author acemma
 * @Date 2021/11/26 15:00
 * @Description
 */

@EnableDiscoveryClient
@SpringBootApplication
public class Payment9002 {

    public static void main(String[] args) {
        SpringApplication.run(Payment9002.class, args);
    }
}
