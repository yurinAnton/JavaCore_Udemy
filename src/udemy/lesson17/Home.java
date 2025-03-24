package udemy.lesson17;

public class Home {

    public static boolean isEqual(StringBuilder a, StringBuilder b) {
        boolean result = true;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello World!");
        StringBuilder sb2 = new StringBuilder("Hello World!");
        StringBuilder sb3 = new StringBuilder("Hello world!");

//        System.out.println(sb1 == sb2);
        System.out.println(Home.isEqual(sb1, sb2));
        System.out.println(Home.isEqual(sb1, sb3));
    }
}
