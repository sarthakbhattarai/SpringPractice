package com.Spring.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapFinder {

    public static void main(String[] args) {
        Map<Integer,Book> bookMap=new HashMap<>();

        bookMap.put(11,new Book("hello world"));
        bookMap.put(12,new Book("bye"));
        bookMap.put(13,new Book("see you"));
        bookMap.put(14,new Book("my"));

        System.out.println(bookMap.get(11));


        Set <Integer> keys = bookMap.keySet();
        for(int key: keys){
            System.out.println(bookMap.get(key));
        }

        var value = bookMap.values();
        for (Book b : value){
            System.out.println(b);
        }
    }

}
