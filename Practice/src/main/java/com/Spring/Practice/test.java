package com.Spring.Practice;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Entity
public class test {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;
    String name;
    int age;
}
