package udemy.lesson23;

public class Main {
    public static void main(String[] args) {

//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();
//
//        Employee emp1 = new Doctor();
//        Employee emp2 = new Teacher();
//        Employee emp3 = new Driver();
//
//        Surgeon sr = new Surgeon();
//        Doctor d2 = new Surgeon();
////        Surgeon sr2 = new Doctor(); - нельзя так писать, т.к. не любой доктор может быть хирургом
//        Employee emp4 = new Surgeon();


        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
//        emp1.cure();

        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

        Doctor d2 = new Surgeon();
        System.out.println(d2.salary);
        System.out.println(d2.age);
        d2.eat();
//        System.out.println(d2.tools); - нельзя, т.к. тип переменной Doctor, а у нее нет tools и surgeon()
//        d2.surgeon();


    }
}


class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat(){
        System.out.println("Nyam-nyam");
    }
    void sleep(){
        System.out.println("Hrrrrr");
    }
}

class Doctor extends Employee {
    String specialization;
    void cure(){
        System.out.println("curing");
    }
}

class Teacher extends Employee {
    int countOfStudents;
    void teach(){
        System.out.println("Teaching");
    }
}

class Driver extends Employee {
    String nameOfCar;
    void drive(){
        System.out.println("Driving");
    }
}

class Surgeon extends Doctor {
    String tools;
    void surgeon(){
        System.out.println("Surgeon");
    }
}