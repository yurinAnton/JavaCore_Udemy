package udemy_advance.less2_Generics;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
//        list.add("Ok");
//        list.add(5);
//        list.add(new StringBuilder("hgfyfhgcf"));
//        list.add(new Car());

        list.add("hello");
        list.add("bye");
        list.add("ok");
        list.add("jhghgf");
//        list.add(new Car());


        for(Object o : list){
            System.out.println(o + " length " + ((String)o).length());
        }

    }
}

class Car {}