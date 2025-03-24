package udemy_advance.less2_Generics;

public class ParameterizedClass {
    public static void main(String[] args) {

//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        Info<Integer> info2 = new Info<>(18);
//        System.out.println(info2);

//        String s1 = info1.getValue();

//        Integer s2 = info2.getValue();

        //----------------------------------------------

//        Pair<String, Integer> pair1 = new Pair<>("hello", 20);
//        System.out.println("Value1: " + pair1.getValue1() + " Value2: " + pair1.getValue2());
//
//        Pair<Integer, Double> pair2 = new Pair<>(64, 3.14);
//        System.out.println("Value1: " + pair2.getValue1() + " Value2: " + pair2.getValue2());
//
//        OtherPair<String> pair3 = new OtherPair<>("privet", "hello");
//        System.out.println("Value1: " + pair3.getValue1() + " Value2: " + pair3.getValue2());

        //----------------------------------------------



    }
}

//class Info<T extends Number & I1 & I2>{
//    private T value;
//    public Info(T value) {
//        this.value = value;
//    }
//    public String toString() {
//        return  "{ [ " + value + " ] }";
//    }
//    public T getValue() {
//        return value;
//    }
//}
//
//class Pair<V1, V2>{
//    private V1 value1;
//    private V2 value2;
//
//    public Pair(V1 value1, V2 value2) {
//        this.value1 = value1;
//        this.value2 = value2;
//    }
//
//    public V1 getValue1() {
//        return value1;
//    }
//
//    public V2 getValue2() {
//        return value2;
//    }
//}
//
//class OtherPair<V>{
//    private V value1;
//    private V value2;
//
//    public V abc(V v){
//        return v;
//    }
//
//    public OtherPair(V value1, V value2) {
//        this.value1 = value1;
//        this.value2 = value2;
//    }
//
//    public V getValue1() {
//        return value1;
//    }
//
//    public V getValue2() {
//        return value2;
//    }
//}
//
//interface I1 {}
//interface I2 {}


