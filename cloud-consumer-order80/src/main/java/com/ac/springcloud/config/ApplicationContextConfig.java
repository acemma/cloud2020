package com.ac.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author acemma
 * @Date 2021/11/9 15:37
 * @Description
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced // 赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }



}
