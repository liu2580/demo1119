package com.example.thread.demo1119.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author liutianqi
 * @date 2019/11/20
 */


@Service
public class TranTest2Service {
    Logger log = LoggerFactory.getLogger(TranTest2Service.class);

    // 线程 1
   // @PostConstruct
    @Scheduled(cron="0/2 * *  * * ? ")
    @Async("taskExecutor")
    public void thread1() throws InterruptedException {
        log.info("线程1---- 执行开始");
        Thread.sleep(5000);
        log.info("线程1---- 执行结束");
    }

      // 线程 2
    //@PostConstruct
    @Scheduled(cron="0/10 * *  * * ? ")
    @Async("taskExecutor")
    public void thread2() throws InterruptedException {

        log.info("线程2---- 执行开始");
        Thread.sleep(2000);
        log.info("线程2---- 执行结束");
    }



}
