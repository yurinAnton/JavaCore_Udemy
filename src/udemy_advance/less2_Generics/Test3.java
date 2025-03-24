package udemy_advance.less2_Generics;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {

//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();

//        List<?> list = new ArrayList<Integer>();

        List<?> list2 = new ArrayList<String>();
//        list2.add("hello");

        List<Double> list3 = new ArrayList<>();
        list3.add(1.0);
        list3.add(3.14);
        list3.add(5.86);

        List<String> list4 = new ArrayList<>();
        list4.add("hello");
        list4.add("world");
        list4.add("!!!");

//        showListInfo(list3);
//        showListInfo(list4);

        //--------------------------------------------------


        List<? extends Number> list5 = new ArrayList<Integer>();

        //---------------------------------------------------

        ArrayList<Double> list6 = new ArrayList<>();
        list6.add(1.0);
        list6.add(3.14);
        list6.add(5.86);
        System.out.println(summ(list6));

        ArrayList<Integer> list7 = new ArrayList<>();
        list7.add(2);
        list7.add(3);
        list7.add(5);
        System.out.println(summ(list7));

    }

    static void showListInfo(List<?> list) {
        System.out.println("List is " + list);
    }

    public static double summ(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
