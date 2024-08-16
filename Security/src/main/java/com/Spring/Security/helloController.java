package com.Spring.Security;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest req){
        //checking the session id
        return "Hello World"+req.getSession().getId();
    }


    @GetMapping("about")
    public String about(){
        return "Spring";
    }


}
