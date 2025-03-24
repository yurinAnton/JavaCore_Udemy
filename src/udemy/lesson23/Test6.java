package udemy.lesson23;

public class Test6 {
    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);

    }
}

class A10{
    String s1 = "hello";
    static double p = 3.14;

    int sum(int... i){
        int res = 0;
        for(int j : i){
            res += j;
        }
        return res;
    }

    static void abc(){
        System.out.println("Static method");
    }
}

class B10 extends A10{
    String s1 = super.s1 + " friend";
    int sum(int... i){
        int res = super.sum(i);
        System.out.println("Summa: " + res);
        return res;
    }
}
