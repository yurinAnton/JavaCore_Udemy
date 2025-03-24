package udemy_advance.less2_Generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // - ArrayList list = new ArrayList();




        list.add(10);
        list.add(20);
        list.add(5);
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("world");
        list2.add("java");
        String s = GenMethod.getSecondElement(list2);
        System.out.println(s);

    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> list){
        return list.get(1);
    }
}

