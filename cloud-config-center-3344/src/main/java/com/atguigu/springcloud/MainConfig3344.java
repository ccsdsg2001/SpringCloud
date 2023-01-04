package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author cc
 * @date 2023年01月04日 22:26
 */
@SpringBootApplication
@EnableConfigServer
public class MainConfig3344 {
     public static void main(String[] args) {
           SpringApplication.run(MainConfig3344.class, args);
      }
     
}
