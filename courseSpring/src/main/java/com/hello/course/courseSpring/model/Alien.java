package com.hello.course.courseSpring.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component

public class Alien {
    private int age;
    private Desktop desk;


    @Autowired
    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Desktop getDesk() {
        return desk;
    }

    public void setDesk(Desktop desk) {
        this.desk = desk;
    }

//    public Alien(int age, Desktop Desk) {
//        super();
//        System.out.println("constructor is called");
//        this.age = age;
//        this.desk=desk;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void compile() {
        System.out.println(age);
        com.compile();
    }

}