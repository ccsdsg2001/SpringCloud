package com.atgui.springcloud.controller;

import com.atgui.springcloud.service.ImessageProvider;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cc
 * @date 2023年01月05日 22:26
 */
@RestController
public class SendMessageController {
    @Resource
    private ImessageProvider imessageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return imessageProvider.send();
    }
}
