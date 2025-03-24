package udemy_advance.less6_Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Ok");
        list.add("Hi there");
        list.add("Good morning");

//        for(int i=0; i<list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

//        list.stream().map(element -> element.length());

        List<Integer> list2 = list.stream().map(element -> element.length())
        .collect(Collectors.toList());

        System.out.println(list2);


        int[] array = {9, 5, 3, 8, 1};

        Arrays.stream(array).map(element ->
        {
            if(element %3==0){
                element = element / 3;
            }
            return element;
        }).toArray();
//        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Ok");
        set.add("Hi there");
        set.add("Good morning");
//        System.out.println(set);


        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set2);



    }
}




