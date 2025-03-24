package udemy.lesson29;

public class Test4 {


    static void def(Test55 t){
        System.out.println(t.abc("Hello World", "!!!"));
    }

    public static void main(String[] args) {

        def((x, y)->(x+y).length());
    }
}

interface Test55{
    int abc(String s, String x);
}
