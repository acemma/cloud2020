package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author acemma
 * @Date 2021/11/26 15:45
 * @Description
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfig3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfig3377.class, args);
    }
}
