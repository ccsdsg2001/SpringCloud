package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cc
 * @date 2023年01月02日 23:15
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {
     public static void main(String[] args) {
           SpringApplication.run(GatewayMain9527.class, args);
      }
     
}
