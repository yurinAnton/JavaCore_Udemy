package udemy.lesson10;

import udemy.lesson9.*;
import udemy.lesson8.*;
import udemy.lesson9.Student;
import static udemy.lesson9.Car.a;

public class A {

    public static void main(String[] args) {
//        udemy.lesson9.lesson9.Car c1 = new udemy.lesson9.lesson9.Car("red", "V6"); // - если не использовать импорт
        Car c1 = new Car("red", "V6");
        udemy.lesson9.Student s1 = new udemy.lesson9.Student();

        // - если названия классов совпадают, то надо прописать полный путь
        udemy.lesson8.Student s2 = new udemy.lesson8.Student("Mike", 2);

        // ----------------------------------------------------------------------------
//        System.out.println(s2.f);
        System.out.println(Student.c);

        String st1 = new String("hello");

        System.out.println(a);
    }
}

class B {
    Student s = new Student();
}
