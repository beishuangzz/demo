package com.example.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController0 {
    @RequestMapping(value="/index0")
    public String index(){
        return "hello111222";
    }
}
