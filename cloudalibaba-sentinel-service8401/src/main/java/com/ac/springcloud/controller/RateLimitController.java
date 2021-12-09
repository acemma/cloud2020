package com.ac.springcloud.controller;

import com.ac.springcloud.common.CommonResult;
import com.ac.springcloud.entity.Payment;
import com.ac.springcloud.handler.CustomBlockHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author acemma
 * @Date 2021/12/2 15:54
 * @Description
 */


@RestController
public class RateLimitController {


    @SentinelResource(value = "byResource", blockHandler = "handlerException", blockHandlerClass = CustomBlockHandler.class)
    @GetMapping("/byResource")
    public CommonResult<Payment> byResource() {
        return new CommonResult<>(200, "按资源名称限流测试OK", new Payment(2022L, "A001"));
    }


}
