package udemy.lesson8;

public class HomeTask {


}

class Class1 {
    static int multy(int a, int b, int c) {
        return a * b * c;
    }

    static void devide(int d, int f) {
        int res = d / f;
        int rest = d % f;
        System.out.println("Result: " + res + " and rest - " + rest);
    }
}


class Class2 {
    static final float p = 3.14f;

    public static void main(String[] args) {
        Class1.multy(1, 2, 3);
        Class1.multy(5, 3, 6);

        Class1.devide(11, 5);
        Class1.devide(23, 7);

        //-----------------------------------------------
//        Class2.length(4);
        System.out.println(Class2.length(4));
        Class2 class2 = new Class2();
        System.out.println(class2.area(5));

        class2.showData(4);

    }
    float area(float a) {
        return  p * a * a;
    }

    static float length(float a) {
        return 2 * p * a;
    }

    void showData(float a){
        System.out.println("Radius of circle: " + a + ", Area: " + area(a) + ", length: " + length(a));
    }

}








