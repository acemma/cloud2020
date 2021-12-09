package com.ac.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author acemma
 * @Date 2021/11/10 14:33
 * @Description
 */
public interface LoadBalancer {


    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
