package JavaClass;

public class Cons {
    int a;
    int b;
    int c;
    String name;


    Cons(int a){
        this.a = a;
        System.out.println("Alone");
    }

    Cons(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("with a and b");
    }

    Cons(int c,String name){
        this.c= c;
        this.name = name;
        System.out.println(" with c and name");
    }

    public static void main(String[] args) {
        Cons c = new Cons(1);
        Cons c1 = new Cons(1,2);
        Cons c3 = new Cons(1,"Hello");
    }

}
