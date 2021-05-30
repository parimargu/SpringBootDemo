package com.datamaking.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String getMessage(){
        return "Welcome to Spring Boot";
    }
}
