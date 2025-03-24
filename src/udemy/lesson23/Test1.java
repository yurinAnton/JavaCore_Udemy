package udemy.lesson23;

public class Test1 {
    public static void main(String[] args) {

//        Teacher2 t = new Teacher2();
//        t.eat();

        Employee2 e = new Teacher2();
        e.eat();

    }
}


class Employee2 {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat(){
        System.out.println("Employee is eating");
    }
//    Meal eat(){
//        System.out.println("Employee is eating");
//        Meal m = new Meal();
//        return m;
//    }
    void sleep(){
        System.out.println("Hrrrrr");
    }
}
class Teacher2 extends Employee2 {
    int countOfStudents;
    void teach(){
        System.out.println("Teaching");
    }
    void eat(){
        System.out.println("Teacher is eating");
    }
//    Fruits eat(){
//        System.out.println("Teacher is eating");
//        Fruits f = new Fruits();
//        return f;
//    }
}

class Meal{
}
class Fruits extends Meal{}