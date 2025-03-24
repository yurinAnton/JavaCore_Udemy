package udemy_advance.less3_Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student2> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Student2 st1 = new Student2("Zaur", "Trigulov", 3);
        Student2 st2 = new Student2("Mihail", "Sergeev", 2);
        Student2 st3 = new Student2("Sergey", "Mihaylov", 1);
        Student2 st4 = new Student2("Andrey", "Chaykovskiy", 4);

        lhm.put(5.8, st1);
        lhm.put(5.9, st4);
        lhm.put(6.4, st2);
        lhm.put(7.7, st3);

        System.out.println(lhm);

        System.out.println(lhm.get(6.4));
        System.out.println(lhm.get(7.7));

        System.out.println(lhm);

    }
}
