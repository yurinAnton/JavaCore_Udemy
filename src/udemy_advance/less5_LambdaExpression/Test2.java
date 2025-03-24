package udemy_advance.less5_LambdaExpression;

public class Test2 {

    static void def(I i){
        System.out.println(i.abc("Hello World"));
    }

    public static void main(String[] args) {

        final int i = 10;
        def((String str) -> {return str.length() + i;} );
        System.out.println();
    }
}

interface I {
    int abc(String s);
}
