package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ControllerDemo {


    @GetMapping ("/hello")
    public String hello() {
        return "Hello World";   
    }

    @GetMapping ("/hi")
    public String hi(){
        return " Mass Aliyaaaaa...";
    }

}
