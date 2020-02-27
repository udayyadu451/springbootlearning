package com.remington.springbootdemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("sayhello")
    public String sayHello(){

        return "Hello";
    }
}
