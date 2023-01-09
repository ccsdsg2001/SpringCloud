package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/testhotkey")
    @SentinelResource(value = "testhotkey",blockHandler = "deal_testhotkey")
    public String testhotkey(@RequestParam(value = "p1",required = false)String p1,
                             @RequestParam(value = "p2",required = false)String p2){
        return "----hotkey";
    }


    public String deal_testhotkey(String p1,
                                  String p2, BlockException exception){
        return "hotkey";
    }
}
