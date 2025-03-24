package udemy.lesson22;

public class Test2 {
    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.name = "John";
        doc.age = 30;


    }
}

class Employee {
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
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {
    int countOfStudents;
    void teach(){
        System.out.println("Teaching");
    }
}

class Surgeon extends Doctor {
    String tools;
    void surgeon(){
        System.out.println("Surgeon");
    }
}



