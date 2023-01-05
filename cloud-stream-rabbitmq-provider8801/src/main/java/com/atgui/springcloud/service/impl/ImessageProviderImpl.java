package com.atgui.springcloud.service.impl;

import com.atgui.springcloud.service.ImessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;


/**
 * @author cc
 * @date 2023年01月05日 22:18
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class ImessageProviderImpl implements ImessageProvider {
    @Resource
    private MessageChannel output;

    @Override
    public String send() {

        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println(serial);
        return null;
    }
}
