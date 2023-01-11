package com.atguigu.springcloud.alibaba.service;


import org.springframework.cloud.openfeign.FeignClient;

public interface StorageService {

    void decrease(Long productId,Integer count);
}
