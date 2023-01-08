package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cc
 * @date 2023年01月08日 20:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main8401 {
     public static void main(String[] args) {
           SpringApplication.run(Main8401.class, args);
      }
     
}
