package com.jchat;

import com.jchat.mem.controller.MemController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JchatBeApplication {

    public static void main(String[] args) {
        MemController memController = new MemController();
        memController.testMethod();
        SpringApplication.run(JchatBeApplication.class, args);
    }

}
