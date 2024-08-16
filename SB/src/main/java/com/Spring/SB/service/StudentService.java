package com.Spring.SB.service;

import com.Spring.SB.model.Student;
import com.Spring.SB.repo.StdRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StdRepo repo;
    private Student stud;

    public Student getStud() {
        return stud;
    }

    public void setStud(Student stud) {
        this.stud = stud;
    }

    public StdRepo getRepo() {
        return repo;
    }

    public void setRepo(StdRepo repo) {
        this.repo = repo;
    }

    public void addStd(Student std) {
        repo.save(std);
    }


    public List<Student> getAllStd(Student std) {
        return repo.getAll(std);
    }
}
