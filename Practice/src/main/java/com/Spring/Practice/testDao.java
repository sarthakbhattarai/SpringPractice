package com.Spring.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
public class testDao {

    @Autowired
    testController tc;

    @RequestMapping("go")
    public String go(){
        System.out.println("hello");
        return("/test.jsp");
    }
    public void getAll(){
        System.out.println("Getting all the data");
       tc.getAllTest();
    }

    public void getByName(String name){
        System.out.println("Getting the data of "+name);
        tc.getByName(name);
    }

    public void deleteByName(String name){
        System.out.println("Deleting the data of "+name);
        System.out.println();
        tc.deletebyName(name);
    }

    public void updateData(test t){
        tc.updateData(t);
    }

    public void saveTest(test t) {
        tc.saveTest(t);
    }
}
