package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author acemma
 * @Date 2021/11/12 14:52
 * @Description
 */

@EnableEurekaClient
@SpringBootApplication
public class StreamMqConsumer8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMqConsumer8802.class, args);
    }
}
