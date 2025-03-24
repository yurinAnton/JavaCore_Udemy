package udemy_advance.less6_Streams;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

//        int result = list.stream().reduce((acc, el) -> acc * el).get();
//        System.out.println(result);


//        int result2 = list.stream().reduce(1, (acc, el) -> acc * el);
//        System.out.println(result2);



        List<String> list3 = new ArrayList<>();
        list3.add("Hello");
        list3.add("Ok");
        list3.add("Hi there");
        list3.add("Good morning");

        String result3 = list3.stream().reduce((a, el) -> a + " " + el).get();
        System.out.println(result3);



        //------------------------------------------------------------

//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = list.stream().reduce((acc, el) -> acc * el);
//
//        if(o.isPresent()) {
//            System.out.println("Is Present, and - " + o.get());
//        } else {
//            System.out.println("Not present!");
//        }



    }
}
