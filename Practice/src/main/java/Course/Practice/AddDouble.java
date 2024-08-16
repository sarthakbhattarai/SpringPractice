package Course.Practice;

import org.hibernate.event.spi.SaveOrUpdateEvent;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddDouble {


    int AddDouble(){
        return 6;
    }


    public static void main(String[] args) {
//
//        double a =1;
////        0.1 increment
//        System.out.println("Adding with double");
//        for(int i=0;i<10;i++){
//            a+=0.1;
//            System.out.println(a);
//        }
//
//        System.out.println();
//        System.out.println("Checking with BigDecimal");
//        BigDecimal d =new BigDecimal(1);
//        BigDecimal e =new BigDecimal(0.1);
////        0.1 increment
//        for(int i=0;i<10;i++){
//            d=d.add(e);
//            System.out.println(d);
//        }
//        System.out.println();
//
//
//
//        System.out.println("Making the double increment correct");
//        BigDecimal b =new BigDecimal("1");
//        BigDecimal c =new BigDecimal("0.1");
////        0.1 increment
//        for(int i=0;i<10;i++){
//            b=b.add(c);
//            System.out.println(b);
//        }
//        System.out.println();
//        //1.1,1.2-----2.1
//
//
//        System.out.println("List test from here");
//        List <Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
//        myList.add(6);
//
//        myList.forEach(
//                s -> System.out.println(s)
//        );
//        System.out.println();
//        System.out.println("+----------------+");
//        System.out.println("| After Adding 1 |");
//        System.out.println("+----------------+");
//        System.out.println();
//        myList.forEach(
//                s -> System.out.println(s+1)
//        );
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println("Withot lambda");
//        for(Integer list:myList){
//            System.out.println(list);
//        }
//
//
//        myList.forEach(System.out::println);
//
//
//        List<Book>myBook = new ArrayList<>();
//        myBook.stream().count();
//        myBook.stream().collect(Collectors.toMap((Book z)->z.getName(),(Book z)->z.getPrice()));
//
//        myBook.stream().filter((Book x)->x.getGenre().startsWith("D"));


        int [][] trye = new int[3][4];
        for (int i = 0;i< trye.length;i++){
            for(int j = 0;j<trye[i].length;j++){
                trye[i][j]=i+j;
            }
            System.out.println("length of first index "+i+" : "+trye[i].length);
            System.out.println("Indexing goes like from top to bottom "+0+" - "+(trye[i].length-1));
            for(int j = 0;j<trye[i].length;j++){
                System.out.println(trye[i][j]);
            }
            System.out.println();

        }




    }




}
