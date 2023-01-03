package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author cc
 * @date 2022年12月31日 22:41
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLever(){
        return Logger.Level.FULL;
    }

}
