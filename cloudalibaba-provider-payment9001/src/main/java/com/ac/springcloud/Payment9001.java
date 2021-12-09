package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author acemma
 * @Date 2021/11/26 14:48
 * @Description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9001 {

    public static void main(String[] args) {
        SpringApplication.run(Payment9001.class, args);
    }

}
