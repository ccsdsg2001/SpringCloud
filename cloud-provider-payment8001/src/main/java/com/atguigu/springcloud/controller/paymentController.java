package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentSerive;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author cc
 * @date 2022年12月26日 16:12
 */
@RestController
@Slf4j
public class paymentController {
    @Resource
    private PaymentSerive paymentSerive;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for(String element:services){
            log.info("element"+element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance:instances){
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;

    }

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentSerive.create(payment);

        log.info("结果{}"+result);
        if(result>0){
            return  new CommonResult(200,"结果成功,serverport:"+serverPort,result);
        }else {
            return new CommonResult(444,"失败",null);
        }
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment payment = paymentSerive.getPaymentById(id);

        log.info("结果{}"+payment);
        if(payment!=null){
            return  new CommonResult(200,"结果成功,serverPort:"+serverPort,payment);
        }else {
            return new CommonResult(444,"失败",null);
        }
    }
}
