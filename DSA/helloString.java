public class helloString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("sarthak1");
        sb.append(" bhattarai");
        sb.insert(9,"Java ");
        System.out.println(sb);

        sb.deleteCharAt(7);
        System.out.println(sb);

        sb.delete(8,13);
        System.out.println(sb);
        System.out.println();

        System.out.println("Now StringBuilder");
        System.out.println();
        StringBuilder sb1 = new StringBuilder("hello");
        sb1.append(" world!");
        sb1.insert(6,"Java ");
        System.out.println(sb1);

        System.out.println();
        System.out.println("----------To the String--------------");
        String name=sb.toString();
        String hello = sb1.toString();
        System.out.println(name);
        System.out.println(hello);


        System.out.println();
        System.out.println("----------Ternary Opreator-------------");
        int a=1;
        int b=2;
        int c;
        c= sb.equals(sb1) ?a:b;
        System.out.println("The value is "+c);


    }
}
