package udemy.lesson8;

//public class Main {
//    public final int a=10;
//
//    Main(){
////        a=10;
//    }
//
//    Main(boolean b){
////        a=10;
//    }
//
//    public void abc(short s){
//        byte b= 10;
//        System.out.println(a+b);
//    }
//
//
//    public static void main(String[] args) {
//
//        Main m = new Main();
//        System.out.println(m.a);
//    }
//}
//
////------------------------------------------------------
//class Car {
//    String color = "blue";
//    String engine = "V6";
//}
//
//class Human {
//    String name = "Mike";
//    final Car car = new Car();
//        static void method(String[] args){
//            Human h = new Human();
////            h.car = new Car();
////            h.car = new Car();
//            h.car.engine = "V8";
//
//        }
//}

//-----------------------------------------------------

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;

        System.out.println("Student: " + count + " created!");
    }

    public static void showCount(){
        System.out.println("Student: " + count + " created!");
    }

    public void display(){
        System.out.println("Welcome to the Student class!");
    }

    void abc(){
        a++;
        count++;
    }

    static void abcd(){
        count++;
//        a++; // - могут использоваться только статичные переменные
    }

//    public static void main(String[] args) {
////        Student s1 = new Student("Mike", 1);
////        Student s2 = new Student("Bob", 4);
////        Student s3 = new Student("Anna", 2);
//
////        System.out.println(s1.name);
////        System.out.println(Student.count);
////        showCount();
////        Student.showCount();
////        s2.showCount();
//        //--------------------------------------
//
//        abcd();
////        abc(); // -ошибка, т.к. не вызван у объекта
//
//    }

}




