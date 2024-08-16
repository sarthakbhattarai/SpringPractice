package com.Spring.Docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {

    @RequestMapping("home")
    public String greet(){
        return "hello";
    }
}
