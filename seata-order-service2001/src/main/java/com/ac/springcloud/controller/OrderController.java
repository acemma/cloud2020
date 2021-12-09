package com.ac.springcloud.controller;

import com.ac.springcloud.common.CommonResult;
import com.ac.springcloud.entity.Order;
import com.ac.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author acemma
 * @Date 2021/12/6 10:02
 * @Description
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }

}
