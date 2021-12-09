package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author acemma
 * @Date 2021/12/1 17:23
 * @Description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelService8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelService8401.class, args);
    }

}
