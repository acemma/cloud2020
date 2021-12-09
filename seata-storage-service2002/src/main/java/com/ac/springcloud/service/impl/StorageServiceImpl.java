package com.ac.springcloud.service.impl;

import com.ac.springcloud.dao.StorageDao;
import com.ac.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author acemma
 * @Date 2021/12/6 11:16
 * @Description
 */

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
    }
}
