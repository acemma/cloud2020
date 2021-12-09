package com.ac.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author acemma
 * @Date 2021/12/6 11:17
 * @Description
 */

@Mapper
public interface StorageDao {

    void decrease(@Param("productId")Long productId, @Param("count") Integer count);

}
