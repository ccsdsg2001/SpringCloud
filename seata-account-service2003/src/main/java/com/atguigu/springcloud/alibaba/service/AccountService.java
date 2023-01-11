package com.atguigu.springcloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;

import java.math.BigDecimal;

public interface AccountService {

    void decrease(Long userId, BigDecimal money);
}
