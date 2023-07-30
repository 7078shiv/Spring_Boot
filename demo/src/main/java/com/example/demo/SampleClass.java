package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SampleClass {
    @Autowired
    HelloRestApi helloRestApi;
    @Autowired
    ArrayList<Integer> numbers;
    public SampleClass(){
        System.out.println();
        System.out.println("Inside sample class");
    }

}
