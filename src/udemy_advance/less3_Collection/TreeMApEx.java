package udemy_advance.less3_Collection;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMApEx {
    public static void main(String[] args) {

        TreeMap<Double, Student2> treeMap = new TreeMap<>(
//                new Comparator<Student2>() {
//            @Override
//            public int compare(Student2 o1, Student2 o2) {
//                return 0;
//            }
//        }
        );
        Student2 st1 = new Student2("Zaur", "Trigulov", 3);
        Student2 st2 = new Student2("Mihail", "Sergeev", 2);
        Student2 st3 = new Student2("Sergey", "Mihaylov", 1);
        Student2 st4 = new Student2("Andrey", "Chaykovskiy", 4);
        Student2 st5 = new Student2("Igor", "Trunov", 2);
        Student2 st6 = new Student2("Dmitriy", "Zenkin", 5);
        Student2 st7 = new Student2("Antosha", "Chehante", 3);


//        Student2 st8 = new Student2("Antosha", "Chehante", 3);

//        treeMap.put(st1, 5.8);
//        treeMap.put(st2, 6.4);
//        treeMap.put(st3, 7.7);
//        treeMap.put(st4, 5.9);
//        treeMap.put(st5, 8.6);
//        treeMap.put(st6, 9.8);
//        treeMap.put(st7, 8.2);

        treeMap.put(5.8, st1);
        treeMap.put(5.9, st4);
        treeMap.put(6.4, st2);
        treeMap.put(7.7, st3);
        treeMap.put(8.2, st7);
        treeMap.put(8.6, st5);
        treeMap.put(9.8, st6);

        System.out.println(treeMap);
//        System.out.println(treeMap.containsKey(st8));
//        System.out.println(treeMap.containsValue(st8));

//        System.out.println(treeMap.get(6.4));
//        treeMap.remove(5.8);
//        System.out.println(treeMap);

//        System.out.println(treeMap.descendingMap());

//        System.out.println(treeMap.tailMap(7.7, true));
//        System.out.println(treeMap.headMap(7.7, true));


    }
}

