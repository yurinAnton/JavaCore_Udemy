package udemy.lesson24;

public class Test2 {
    public static void main(String[] args) {

        Help_Able h = new Driver();
        Swim_Able s = new Driver();
        Employee e = new Driver();

        System.out.println(h.a);
        h.extFire("water");
        h.help();

    }
}

class Employee {
    double salary = 100;
    String name= "Nikola";
    int age;
    int experience;

    void eat(){
        System.out.println("Nyam-nyam");
    }
    void sleep(){
        System.out.println("Hrrrrr");
    }
}

class Teacher extends Employee implements Help_Able{
    int countOfStudents;
    void teach(){
        System.out.println("Teaching");
    }
    public void help(){
        System.out.println("Teacher help");
    }
    public void extFire(String tool){
        System.out.println("Teacher extinguish the Fire");
    }
}

class Driver extends Employee implements Help_Able, Swim_Able {
    String nameOfCar;
    void drive(){
        System.out.println("Driving");
    }
    public void help(){
        System.out.println("Driver help");
    }
    public void extFire(String tool){
        System.out.println("Driver extinguish the Fire");
    }
    public void swim(){
        System.out.println("Driver swimming");
    }
}

interface Help_Able{
    void help();
    void extFire(String tool);
    int a=10;
}

interface Swim_Able{
    void swim();
}







