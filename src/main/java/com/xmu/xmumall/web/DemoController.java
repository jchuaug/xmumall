package com.xmu.xmumall.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/")
    public String hello(){
        System.out.println("Hello");
        return "Hello";
    }

}
