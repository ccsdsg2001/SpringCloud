package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cc
 * @date 2022年12月29日 16:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayMain8006 {
    public static void main(String[] args) {
        SpringApplication.run(PayMain8006.class, args);
    }
}
