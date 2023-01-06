package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cc
 * @date 2023年01月06日 23:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigMain3377 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigMain3377.class, args);
      }
     
}
