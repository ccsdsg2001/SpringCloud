package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cc
 * @date 2023年01月04日 22:39
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClienMain3355 {
     public static void main(String[] args) {
           SpringApplication.run(ConfigClienMain3355.class, args);
      }

}
