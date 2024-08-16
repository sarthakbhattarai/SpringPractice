package com.Spring.Security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
   List<Student> students= new ArrayList<>(List.of(
           new Student(1,"ram","java"),
           new Student(2,"hari","java")
   ));


   @GetMapping("students")
   public List<Student> getStd(){
       return students;
   }




    @GetMapping("getToken")
   public CsrfToken getCsrfTokem(HttpServletRequest req){
       return (CsrfToken) req.getAttribute("_csrf");
   }

    @PostMapping("addStd")
   public void addStd(@RequestBody Student std){
       students.add(std);
   }
}
