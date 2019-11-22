package com.example.thread.demo1119.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//异步调用
@RestController
public class TController {
    @GetMapping("/hello")
    public String hello(){
        new Thread(()->{
            rest();
        }).start();
        rest();
        return "hello";
    }

//    @Async("taskExecutor")
    public void rest(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
