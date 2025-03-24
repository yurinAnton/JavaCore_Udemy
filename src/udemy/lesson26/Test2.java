package udemy.lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); // autoboxing
        int a = list.get(0); // unboxing
//        System.out.println(a);

        Number b = new Integer(10);
        int c = (Integer) b;

        String s1 = "50";
        int i1 = Integer.parseInt(s1);
//        System.out.println(i1);

        String s2 = "true";
        Boolean b1 = Boolean.parseBoolean(s2);
//        System.out.println(b1);

        String s3 = "3.14";
        Double d1 = Double.parseDouble(s3);
//        System.out.println(d1);

        Integer i2 = Integer.valueOf(10);
        Double d2 = Double.valueOf(s3);
        System.out.println(i2);
        System.out.println(d2);

//        Byte b10 = new Byte((byte) 10);

    }
}




