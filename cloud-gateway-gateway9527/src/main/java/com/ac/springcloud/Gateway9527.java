package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author acemma
 * @Date 2021/11/11 11:27
 * @Description
 */

@EnableEurekaClient
@SpringBootApplication
public class Gateway9527 {

    public static void main(String[] args) {
        SpringApplication.run(Gateway9527.class, args);
    }

}
