package udemy.lesson17;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello World!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

//        System.out.println(sb3.length());
//        System.out.println(sb2.charAt(3));
//        System.out.println(sb2.indexOf("e"));
//        System.out.println(sb2.substring(0, 5));
//        System.out.println(sb2.subSequence(0, 5));

//        System.out.println(sb2.append("!!"));
//        System.out.println(sb2.append(sb2));

        System.out.println(sb2.insert(11, ", Hi"));

//        System.out.println(sb2.delete(5, 11));
//        System.out.println(sb2.reverse());

        System.out.println(sb2.replace(0, 5, "Hi"));
        System.out.println(sb2.capacity());

        //-----------------------------------------------------

        StringBuilder sb5 = new StringBuilder("Hello friend!");
        String s = null;
        s = sb5.append("How are you?").substring(sb5.indexOf("f"), sb5.indexOf("!"));
        System.out.println(s);


        StringBuilder sb6 = new StringBuilder("123");
        StringBuilder sb7 = sb6.append("45");
        StringBuilder sb8 = sb7.append("6");
        StringBuilder sb9 = sb8.append("7");
        System.out.println("sb1 == " + sb6);
        System.out.println("sb2 == " + sb7);
        System.out.println(sb6.equals(sb9));

    }
}


