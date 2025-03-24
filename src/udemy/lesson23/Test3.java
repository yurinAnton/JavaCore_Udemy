package udemy.lesson23;

public class Test3 {
    public static void main(String[] args) {

        Employee3 emp = new Employee3();
        Teacher3 tch = new Teacher3();
//        emp.sleep();
        tch.sleep();
        Employee3 etc = new Teacher3();
        etc.sleep();
    }
}

class Employee3 {
    double salary = 100;
    String name;

        Meal2 eat(){
        System.out.println("Employee is eating");
        Meal2 m = new Meal2();
        return m;
    }
//    private void sleep(){
//        System.out.println("Sleeps Employee");
//    }
    static void sleep(){
        System.out.println("Sleeps Employee");
    }
}

class Teacher3 extends Employee3 {
    int countOfStudents;
    void teach(){
        System.out.println("Teaching");
    }
@Override
    Fruits2 eat(){
        System.out.println("Teacher is eating");
        Fruits2 f = new Fruits2();
        return f;
    }
//    @Override
    static void sleep(){
        System.out.println("Sleeps Teacher");
    }
}
class Meal2{ }
class Fruits2 extends Meal2{}