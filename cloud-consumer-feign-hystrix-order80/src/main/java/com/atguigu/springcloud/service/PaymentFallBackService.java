package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author cc
 * @date 2023年01月01日 22:38
 */
@Component
public class PaymentFallBackService implements  PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK fallback";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "paymentInfo_TimeOut fallback";
    }
}
