package udemy_advance.less2_Generics;

public class ParameterizedClass2 {

    public static void main(String[] args) {

//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        Info<Integer> info2 = new Info<>(18);
//        System.out.println(info2);

//        String s1 = info1.getValue();

//        Integer s2 = info2.getValue();

        //----------------------------------------------



    }

//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }

//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }

}

class Info<T>{
    private T value;
    public Info(T value) {
        this.value = value;
    }
    public String toString() {
        return  "{ [ " + value + " ] }";
    }
    public T getValue() {
        return value;
    }
}



class Parent {
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}

//class Child extends Parent {
//    public void abc(Info<Integer> info){
//        String s = info.getValue();
//    }
//}