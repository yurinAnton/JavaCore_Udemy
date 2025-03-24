package udemy_advance.less3_Collection;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {

//        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Anton");
        list1.add("Bill");
        list1.add("Cortny");
//        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>(200);
//        List<String> list3 = new ArrayList<>();
        list2.add("Anton");
        list2.add("Bill");
        list2.add("Anna");
//        System.out.println(list2);

        List<String> list4 = new ArrayList<>(list1);
        System.out.println(list4);

        System.out.println(list4 == list1);





    }
}
