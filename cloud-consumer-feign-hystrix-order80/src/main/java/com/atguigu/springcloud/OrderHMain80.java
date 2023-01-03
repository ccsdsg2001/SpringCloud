package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cc
 * @date 2023年01月01日 15:08
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderHMain80.class, args);
      }
     
}
