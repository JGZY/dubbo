package com.wj.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboBootConsumerApplication {

    ///
    public static void main(String[] args) {
        System.out.println("aaa");
        SpringApplication.run(DubboBootConsumerApplication.class, args);
    }

}
