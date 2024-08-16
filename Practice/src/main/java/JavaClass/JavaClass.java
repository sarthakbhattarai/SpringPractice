package JavaClass;

public class JavaClass {
    int a;

    JavaClass(int a){
        this.a = a;
    }

    JavaClass(JavaClass p){
        this.a = p.a;
    }

    public static void main(String[] args) {

        JavaClass j = new JavaClass(1);
        System.out.println();
        System.out.println(j.a);



        JavaClass j1 = new JavaClass(j);
        j1.a=2;
        System.out.println(j1.a);
        System.out.println(j.a);


    }


}
