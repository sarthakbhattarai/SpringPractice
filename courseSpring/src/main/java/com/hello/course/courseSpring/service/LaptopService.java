package com.hello.course.courseSpring.service;

import com.hello.course.courseSpring.repository.LaptopRepository;
import com.hello.course.courseSpring.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

}
