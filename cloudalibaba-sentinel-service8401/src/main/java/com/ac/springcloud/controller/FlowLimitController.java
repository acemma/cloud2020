package com.ac.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author acemma
 * @Date 2021/12/1 17:24
 * @Description
 */

@Slf4j
@RestController
public class FlowLimitController {

    @GetMapping(value = "/testA")
    public String testA() {
        log.info(Thread.currentThread().getName());
        return "===testA";
    }

    @GetMapping(value = "/testB")
    public String testB() {
        log.info("===testB");
        return "===testB";
    }

    @GetMapping(value = "/testC")
    public String testC() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("===testC RT");
        return "===testC";
    }

    @GetMapping(value = "/testD")
    public String testD() {
        int a = 10 / 0;
        log.info("===testD 异常比例");
        return "===testD";
    }

    @SentinelResource(value = "testHotKey", blockHandler = "dealTestHotKey")
    @GetMapping("/testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {


        log.info("===testHotKey");
        return "===testHotKey";
    }

    public String dealTestHotKey(@RequestParam(value = "p1", required = false) String p1,
                                 @RequestParam(value = "p2", required = false) String p2,
                                 BlockException blockException) {
        return "===dealTestHotKey";
    }
}
