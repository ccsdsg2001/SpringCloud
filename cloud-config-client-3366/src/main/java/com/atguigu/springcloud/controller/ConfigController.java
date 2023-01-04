package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cc
 * @date 2023年01月04日 23:14
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${info.port}")
    private String infoAge;

    @Value("${config.port}")
    private String serverPort;
    @RequestMapping("/configInfo")
    public String getServerPort() {
        return "serpot"+serverPort+infoAge;
    }
}
