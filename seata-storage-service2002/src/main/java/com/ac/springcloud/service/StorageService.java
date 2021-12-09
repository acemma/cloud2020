package com.ac.springcloud.service;

/**
 * @Author acemma
 * @Date 2021/12/6 11:15
 * @Description
 */
public interface StorageService {

    void decrease(Long productId, Integer count);
}
