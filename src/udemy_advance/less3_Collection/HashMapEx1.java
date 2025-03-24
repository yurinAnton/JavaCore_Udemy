package udemy_advance.less3_Collection;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Yurin Anton");
        map1.put(3686, "Ivan Ivanov");
        map1.put(2536, "Anna Sidorova");
        map1.put(7428, "Nikolay Petrov");
        map1.put(7429, "Nikolay Petrov");
//        map1.put(7429, "Mihail Rozhin");
//        map1.put(null, "Sergey Sidorov");

//        map1.putIfAbsent(1000, "dfhj,nk.ml;./");
//        System.out.println(map1.get(1000));
//        map1.remove(7429);

//        System.out.println(map1.containsValue("Nikolay Petrov"));
//        System.out.println(map1.containsKey(1000));

//        System.out.println(map1.keySet());
//        System.out.println(map1);


        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Hello", "world");
        map2.put("goodbye", "kitty");
        map2.put("hi", "world");
        System.out.println(map2);


    }
}
