package com.example.thread.demo1119;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

@EnableAsync
@EnableScheduling
public class Demo1119Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1119Application.class, args);
    }

}
