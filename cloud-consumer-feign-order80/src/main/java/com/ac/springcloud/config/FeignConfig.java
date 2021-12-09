package com.ac.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author acemma
 * @Date 2021/11/10 15:30
 * @Description
 */
@Configuration
public class FeignConfig {
    /**
     * 配置feign日志
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
