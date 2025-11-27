package com.jchat.mem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mem")
public class MemController {

    @GetMapping("/testMethod")
    public void testMethod() {
        System.out.println("1111111111");
        System.out.println("testMethod");
    }
}
