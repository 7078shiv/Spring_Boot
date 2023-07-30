package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class WelcomeController{
    ArrayList<Integer> numbers;
    @Value("${name}")
    String name;
    @Autowired
    public WelcomeController(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @GetMapping
    public String getWelcomeMessage() {
        return numbers.toString();
    }


    @GetMapping("/name")
    public String getName(){
        return name;
    }

    @PostMapping
    public String postmapping(){
        return "this is post mapping";
    }

    @PutMapping
    public String putApi(){
        return "this is put method Api";
    }

    @PatchMapping
    public String patchApi(){
        return "this is patch method Api";
    }

    @DeleteMapping
    public String deleteApi(){
        return "this is delete method Api";
    }

}
