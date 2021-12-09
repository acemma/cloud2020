package com.ac.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author acemma
 * @Date 2021/11/12 13:59
 * @Description
 */
@EnableEurekaClient
@SpringBootApplication
public class StreamMqProvider8801 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMqProvider8801.class, args);
    }

}
