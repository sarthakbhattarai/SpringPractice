package Inheritence;

public class A {
    String name;
}

class B extends A{
    B(){
        super.name="Train";
    }

    public static void main(String[] args) {

        B b = new B();
        System.out.println(b.name);

    }
}
