package com.example.demo.pojo;

import org.springframework.stereotype.Component;

/**
 * @author yrk
 * @date 2020/5/10 - 16:17
 */
@Component
public class Dog {
    private String name = "狗";

    public String getName() {
        return name;
    }


    public String dog(){
        return this.name;
    }

}
