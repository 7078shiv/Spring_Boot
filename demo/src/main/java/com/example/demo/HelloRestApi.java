package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloRestApi {
    public  HelloRestApi() {
        System.out.println("I am inside hello Rest Api class");
    }
    public String Hello(){
        return "Helloworld";
    }
}
