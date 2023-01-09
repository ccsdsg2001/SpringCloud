package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author cc
 * @date 2023年01月09日 23:22
 */
public class CustomerBlockhandler {

    public static CommonResult handleException(BlockException exception){
        return new CommonResult(4444,"按客户自定义OK",new Payment(2020L,"serial002"));
    }
    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(44444,"按客户自定义OK",new Payment(2020L,"serial001"));
    }
}
