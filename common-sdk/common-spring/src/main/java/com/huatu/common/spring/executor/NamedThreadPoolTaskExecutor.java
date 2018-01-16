package com.huatu.common.spring.executor;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hanchao
 * @date 2017/9/30 20:15
 */
public class NamedThreadPoolTaskExecutor extends ThreadPoolTaskExecutor {
    private static final long serialVersionUID = 1L;
    private String name;

    public NamedThreadPoolTaskExecutor(String name){
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService e = Executors.newFixedThreadPool(0);
        e.submit(()->{
            throw new IllegalArgumentException();
        });
        Thread.sleep(1000);
        e.submit(()->{
            System.out.println("---");
        });

        e.shutdown();
    }
}
