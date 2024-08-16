package com.hello.course.courseSpring.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Desktop implements Computer {
    public Desktop(){
        System.out.println("Desktop created");
    }
    @Autowired
    private Laptop laptop;


    @Override
    public void compile(){
        System.out.println("Compiling in desktop");
    }


}
