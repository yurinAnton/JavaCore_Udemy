package udemy_advance.less3_Collection;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Anton");
        list1.add("Bill");
        list1.add("Anna");
        list1.add("Igor");
        list1.add("Elena");
//        System.out.println(list1);

//        List<String> list3 = list1.subList(1, 4);
//        System.out.println(list3);
//        list3.add("Fedor");
//        System.out.println(list3);
//        System.out.println(list1);

//        List<String> list2 = new ArrayList<>();
//        list2.add("Anton");
//        list2.add("Bill");
//        System.out.println(list2);

//        Object[] array1 = list1.toArray();
//        String[] array2 = list1.toArray(new String [7]);
////        System.out.println(array1);
//       for(String s:array2){
//           System.out.println(s);
//       }


//        List<Integer> list3 = List.of(2,9,6);
//        list3.add(100);
//        System.out.println(list3);


        List<String> list4 = List.copyOf(list1);
        System.out.println(list4);






    }
}
