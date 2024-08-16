package com.hello.course.courseSpring.model;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("laptop created");
    }

    public void compile(){
        System.out.println("Compiling in laptop");
    }
}
