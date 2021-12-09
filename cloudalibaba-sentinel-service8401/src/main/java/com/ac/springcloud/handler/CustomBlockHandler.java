package com.ac.springcloud.handler;

import com.ac.springcloud.common.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Author acemma
 * @Date 2021/12/2 16:02
 * @Description
 */


public class CustomBlockHandler {

    public static CommonResult handlerException(BlockException blockException) {
        return new CommonResult(444, "自定义全局限流处理--1");
    }

    public static CommonResult handlerException2(BlockException blockException) {
        return new CommonResult(444, "自定义全局限流处理--2");
    }
}
