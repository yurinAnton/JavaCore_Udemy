package udemy_advance.less4_NestedClass;

public class Test1 {

    static class A{}
    class B extends A{}

    void method(){
        class C extends B{}
    }


    public static void main(String[] args) {

    }
}
