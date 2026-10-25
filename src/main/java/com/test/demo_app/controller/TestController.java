package com.test.demo_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class TestController {
 
    //here we create a handler method
    @RequestMapping("/")
    public String test(){
        return "Hello World";
    }
}
