package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class Demo_Configuration {
    @Bean
    public ArrayList<Integer> getNumbers(){
        System.out.println("Insde beans method which create and return arraylist in spring boot");
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        return num;
    }
}
