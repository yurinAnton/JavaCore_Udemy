package udemy_advance.less3_Collection.Set_interface;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("Zaur");
        set.add("Igor");
        set.add("Oleg");
        set.add("Marina");
//        set.add("Marina");
//        set.add(null);
//        System.out.println(set);

//        set.remove("Zaur");

//        for (String s : set) {
//            System.out.println(s);
//        }
//        System.out.println(set.contains("Zaur"));

        //---------------------------------------

        HashSet<Integer> hset1 = new HashSet<>();
        hset1.add(5);
        hset1.add(2);
        hset1.add(3);
        hset1.add(1);
        hset1.add(8);

        HashSet<Integer> hset2 = new HashSet<>();
        hset2.add(7);
        hset2.add(4);
        hset2.add(3);
        hset2.add(5);
        hset2.add(8);

        HashSet<Integer> union = new HashSet<>(hset1);
        union.addAll(hset2);
        System.out.println(union);

        HashSet<Integer> interSect = new HashSet<>(hset1);
        interSect.retainAll(hset2);
        System.out.println(interSect);

        HashSet<Integer> subtract = new HashSet<>(hset1);
        subtract.removeAll(hset2);
        System.out.println(subtract);



    }
}
