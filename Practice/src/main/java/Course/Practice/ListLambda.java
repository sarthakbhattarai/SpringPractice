package Course.Practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListLambda {

    public static void main(String[] args) {

        List<Book> b = new ArrayList<>();

        b.add(new Book("Medical OT", "Medical",1111111111));
        b.add(new Book("Physics OpT", "Engineering",10111));
        b.add(new Book("Bio OT", "Forestry",1112121));

        System.out.println(b);

//        Collections.sort(b);




        Collections.sort(b, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(b);


        Collections.sort(b,(a,bo)->{
            return a.getPrice();
        });


        Collections.sort(b,(a,bo)->  a.getPrice());

//        for (Book bo : b ){
//            System.out.println(bo);
//        }

        b.stream().filter(c-> c.getName().equals("Medical T")).forEach(a-> System.out.println(a.getGenre()));
        b.stream().forEach(a-> System.out.println(a.getPrice()));

        List <Book> boo =  b.stream().filter(c-> c.getName().equals("Medical OT")).toList();
        System.out.println(boo);


//        b.stream().map(a->{
//            a.setPrice(a.getPrice().add(new BigDecimal(20)));
//            return a;
//        }).forEach(a-> System.out.println(a));
    }

}
