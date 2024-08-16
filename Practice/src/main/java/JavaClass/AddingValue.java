package JavaClass;

public class AddingValue {

    int add(int a,int b){
        System.out.println("Adding two numbers");
        return a+b;
    }

    int add(int a,int b,int c){
        System.out.println("Adding three numbers");
        return a+b+c;
    }
    double add(double a,double b,double c){
        System.out.println("Adding three numbers with double");
        return a+b+c;
    }

    public static void main(String[] args) {
        AddingValue a = new AddingValue();
        System.out.println(a.add(2,3));
        System.out.println(a.add(1,2,3));
        System.out.println(a.add(1.1,2.4,3.5));
    }



}
