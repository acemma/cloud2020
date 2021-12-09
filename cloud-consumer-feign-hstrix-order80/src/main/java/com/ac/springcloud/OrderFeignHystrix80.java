package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author acemma
 * @Date 2021/11/10 16:21
 * @Description
 */

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class OrderFeignHystrix80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrix80.class, args);
    }

}
