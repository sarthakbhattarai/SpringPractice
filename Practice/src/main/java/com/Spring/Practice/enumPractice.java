package com.Spring.Practice;


//enum is a class which contain the name constant objects
//enum cannot be extended
enum Status{
    RUNNING, PENDING, PROCESSING, DONE;
}

enum Laptop {
    MacBook(2000), Zenbook(1500);
    private  int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class enumPractice {

    public static void main(String[] args) {

        System.out.println("------Status------");
        Status s = Status.DONE;
        System.out.println(s+" : "+ s.ordinal());
        System.out.println();

        if(s==Status.DONE){
            System.out.println("Completed");
        } else if (s==Status.PENDING) {
            System.out.println("wait");
        } else if (s==Status.RUNNING) {
            System.out.println("Working on");
        } else if (s==Status.PROCESSING) {
            System.out.println("Almost there");
        }


        System.out.println();
        System.out.println("------------------");
        System.out.println("------Laptop------");
        System.out.println("------------------");
        Laptop[] l = Laptop.values();
        for(Laptop ll : l){
            System.out.println(ll + " : $"+ll.getPrice());
        }
    }
}
