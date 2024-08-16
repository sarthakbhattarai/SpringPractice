package com.hello.course.courseSpring.repository;

import com.hello.course.courseSpring.model.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("saved");
    }
}
