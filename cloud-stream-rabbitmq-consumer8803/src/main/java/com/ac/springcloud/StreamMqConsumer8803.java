package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author acemma
 * @Date 2021/11/12 15:14
 * @Description
 */

@EnableEurekaClient
@SpringBootApplication
public class StreamMqConsumer8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMqConsumer8803.class, args);
    }
}
