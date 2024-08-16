package com.Spring.Practice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class testController {
    @Autowired
    testRepo repo;

    @Autowired
    PasswordEncDec PeDe;

    public void getAllTest(){
        List <test> l = repo.findAll();
        if(l.isEmpty() || l==null){
            System.out.println("There is no data inserted");
        }else{
            for (test t : repo.findAll()){
                System.out.println(t.getId()+" "+t.getName()+" "+t.getAge());
            }
        }
    }

    public void getByName(String name){

        List<test> result = repo.findByName(name);
        if(result==null || result.isEmpty()){
            System.out.println("There is no entry with name "+name);
        }
        else {
            for (test t : repo.findByName(name)){
                System.out.println(t.getId()+" "+t.getName()+" "+t.getAge());
            }
        }

    }

    public void saveTest(test t) {
        String enc = PeDe.encrypt(t.getName());
        t.setName(enc);
        repo.save(t);
    }

    public void deletebyName(String name){
        List<test> result = repo.findByName(name);
        if(result==null || result.isEmpty()){
            System.out.println("There is no entry with name "+name);
        }
        else{
            repo.deleteByName(name);
            System.out.println("The entry of "+name+" has been removed");
        }

    }


    public void delete(test t){
        repo.delete(t);
    }

    public void updateData(test t) {
        Optional<test> result = repo.findById(t.getId());
        if (!result.isPresent()) {
            System.out.println("Can't find the person with this ID " + t.getId());
        } else {
            repo.save(t);
        }
    }

}
