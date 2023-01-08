package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author cc
 * @date 2023年01月08日 20:31
 */
@RestController
@Slf4j
public class flowlimitcontroller {

    @RequestMapping("testA")
    public String testA(){
        log.info(Thread.currentThread().getName()+"test1");
        return "testA-------";
    }

    @RequestMapping("testB")
    public String testB(){
        log.info(Thread.currentThread().getName()+"testb");
        return "testB-------";
    }

    @RequestMapping("testC")
    public String testC(){
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "testC 测试RT-------";
    }

    @RequestMapping("testD")
    public String testD(){
        System.out.println("testD 异常比例测试");
        int age = 10/0;
        return "testD-------";
    }

    @RequestMapping("testE")
    public String testE(){
        System.out.println("testD 异常s数--测试");
        int age = 10/0;
        return "testD-------";
    }
}
