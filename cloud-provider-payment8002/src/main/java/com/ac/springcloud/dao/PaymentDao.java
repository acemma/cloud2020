package com.ac.springcloud.dao;

import com.ac.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author acemma
 * @Date 2021/11/9 17:34
 * @Description
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getById(@Param("id") Long id);
}
