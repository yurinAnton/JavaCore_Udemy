package udemy_advance.less4_NestedClass.Annonimous_class;

public class AnonimousClass {

    public static void main(String[] args) {

        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(m.doOperation(1, 2));
        System.out.println(m2.doOperation(2, 2));
    }
}


interface Math{
    int doOperation(int a, int b);
}
