package com.ac.springcloud.dao;

import com.ac.springcloud.entity.Order;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

/**
 * @Author acemma
 * @Date 2021/12/6 10:35
 * @Description
 */

@SpringBootTest
public class OrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    @Test
    @Disabled
    public void testCreate() {
        Order order = new Order();
        order.setProductId(1L);
        order.setUserId(1L);
        order.setCount(1);
        order.setMoney(BigDecimal.ONE);
        orderDao.create(order);
    }
}
