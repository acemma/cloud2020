package com.ac.springcloud.service.impl;

import com.ac.springcloud.dao.OrderDao;
import com.ac.springcloud.entity.Order;
import com.ac.springcloud.service.AccountService;
import com.ac.springcloud.service.OrderService;
import com.ac.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author acemma
 * @Date 2021/12/3 14:10
 * @Description
 */

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private AccountService accountService;
    @Autowired
    private StorageService storageService;

    @GlobalTransactional(name = "my_tx_create_order", rollbackFor = Exception.class)
    @Override
    public void create(Order order) {

        // 创建订单
        log.info("----> 开始创建订单");
        orderDao.create(order);
        log.info("----> 创建订单end");

        // 扣库存
        log.info("----> 订单微服务开始调用库存，count做减扣");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("----> 订单微服务开始调用库存，count做减扣end");

        // 扣减账户
        log.info("----> 订单微服务开始调用账户，money做减扣");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("----> 订单微服务开始调用账户，money做减扣end");

        // 修改订单状态
        log.info("----> 开始修改订单状态");
        orderDao.update(order.getUserId(), 0);
        log.info("----> 修改订单状态end");
    }
}
