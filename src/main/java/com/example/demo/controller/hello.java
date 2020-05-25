package com.example.demo.controller;

import com.example.demo.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yrk
 * @date 2020/5/10 - 11:15
 */
@RestController
public class hello {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring-Boot";
    }
}
