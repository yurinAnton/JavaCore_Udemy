package udemy.lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
//        list.add("Hello");
//
//        Car c = new Car();
//        list.add(c);
//
//        Student s = new Student();
//        list.add(s);
//
//        list.add(new StringBuilder("ok"));


        ArrayList <String> list2 = new ArrayList <String>();
        list2.add("Hello");

        ArrayList <StringBuilder> list3 = new ArrayList <>();
//        List <StringBuilder> list4 = new ArrayList <>();

        ArrayList <String> list4 = new ArrayList <>(30);

        ArrayList <String> list5 = new ArrayList <>(list2);
//        System.out.println(list2 == list5);

        //-----------Methods--------------

        ArrayList <String> list6 = new ArrayList <>(list2);
        list6.add("Hello");
        list6.add("Hi");
        list6.add("Good bye");
        list6.add(1, "Privet");
        list6.add(5, "Privet");

//        System.out.println(list6.get(3));
//        System.out.println();

        list6.set(0, "!!!");

//        for(String s : list6){
//            System.out.print(s + " ");
//        }


        ArrayList<StringBuilder> list7 = new ArrayList<>();
//        StringBuilder s1 = new StringBuilder("Hello");
//        StringBuilder s2 = new StringBuilder("ok");
//        StringBuilder s3 = new StringBuilder("Privet");
//        list7.add(s1);
//        list7.add(s2);
//        list7.add(s3);

        ArrayList<String> list8 = new ArrayList<>();
        list8.add("Petrov");
        list8.add("Sidorov");
        ArrayList<String> list9 = new ArrayList<>();
        list9.add("Pyazanov");
        list9.add("Borovik");

        list8.addAll(list9);

//        for(int i=0; i<list7.size(); i++){
//            list7.get(i).append("!!!");
//        }

//        list7.remove(2);
//        list7.remove(s1);

//        for(StringBuilder s : list7){
//            System.out.print(s + " ");
//        }

//        for(String s : list8){
//            System.out.print(s + " ");
//        }


        //---------------------------------------------

        ArrayList<StringBuilder> list10 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("Privet");
        list10.add(sb1);
        list10.add(sb2);
        list10.add(sb3);

        ArrayList<StringBuilder> list11 = new ArrayList<>();
        StringBuilder sb4 = new StringBuilder("Ivanov");
        StringBuilder sb5 = new StringBuilder("Petrov");
        list11.add(sb4);
        list11.add(sb5);

        list10.addAll(list11);

//        for(StringBuilder s : list10){
//            System.out.print(s + " ");
//        }
//        System.out.println();
//        list11.get(1).append("!");

//        list10.clear();

//        for(StringBuilder s : list10){
//            System.out.print(s + " ");
//        }
        System.out.println();
//        System.out.println(list10.indexOf("ok"));

        //-----------------------------------------

        ArrayList<StringBuilder> list12 = new ArrayList<>();
        StringBuilder sb6 = new StringBuilder("A");
        StringBuilder sb7 = new StringBuilder("B");
        StringBuilder sb8 = new StringBuilder("C");
        list12.add(sb6);
        list12.add(sb7);
        list12.add(sb8);

//        ArrayList<StringBuilder> list13 = (ArrayList<StringBuilder>) list12.clone();
//        System.out.println(list12 == list13);
//        System.out.println(list12.get(0) == list13.get(0));

        Object[] array = list12.toArray();

        StringBuilder[] array2 = list12.toArray(new StringBuilder[10]);

//        for(Object s : array2){
//            System.out.print(s + " ");
//        }


//        StringBuilder[] array3 = {sb6, sb7, sb8, sb6};
//        List<StringBuilder> list14 = Arrays.asList(array3);
//        System.out.println(list14);
//        array3[0].append("!!!");
//        System.out.println(list14);
//        array3[0] = new StringBuilder("!!!");
//        System.out.println(list14);



        String s1= "A";
        String s2= "B";
        String s3= "C";
        String s4= "D";
        ArrayList<String> list15 = new ArrayList<>();
        list15.add(s1);
        list15.add(s4);
        list15.add(s2);
        list15.add(s3);

//        System.out.println(list15);
//        Collections.sort(list15);
//        System.out.println(list15);

        Iterator <String> iterator = list15.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

class Car{}
class Student{}