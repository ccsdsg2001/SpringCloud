package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cc
 * @date 2022年12月31日 15:50
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeifnMain80 {
     public static void main(String[] args) {
           SpringApplication.run(OrderFeifnMain80.class, args);
      }
     
}
