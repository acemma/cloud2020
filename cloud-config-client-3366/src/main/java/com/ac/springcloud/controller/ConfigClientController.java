package com.ac.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author acemma
 * @Date 2021/11/12 10:36
 * @Description
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;
    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/configInfo")
    public String getConfigInfo() {
        return "serverPort:" + serverPort + "\n" + "configInfo:" + configInfo;
    }
}
