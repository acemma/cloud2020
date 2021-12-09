package com.ac.springcloud.dao;

import com.ac.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author acemma
 * @Date 2021/12/3 14:08
 * @Description
 */

@Mapper
public interface OrderDao {

    void create(Order order);


    void update(@Param("userId")Long userId, @Param("status") Integer status);

}
