package udemy.lesson3;

public class Main {
    public static void main(String[] args) {
        int i1= 5;
        int i2= 11;
        double d1= 5.5;
        double d2= 1.3;
        long l= 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);
        System.out.println();

        int a = 5;
        int b = 8;
        System.out.println(a-- - --a + ++a + a++ + a);
        System.out.println();
        System.out.println(++b - b++ + ++b - --b);
    }
}
