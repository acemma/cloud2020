package com.ac.springcloud.service;

import java.math.BigDecimal;

/**
 * @Author acemma
 * @Date 2021/12/6 11:41
 * @Description
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);
}
