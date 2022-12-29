package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentSerive;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cc
 * @date 2022年12月26日 16:10
 */
@Service
public class paymentImpl implements PaymentSerive {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
