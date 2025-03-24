package udemy.lesson25;

public class Test3 {

    public static void main(String[] args) {


        Employee2 emp = new Employee2();
        Employee2 emp1 = new Doctor2();
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Driver2();

        Test3 t = new Test3();

        Help_Able h = new Doctor2();
//        h.help();

        Doctor2 doc = (Doctor2)emp1;
//        System.out.println(doc.specialization);
//        System.out.println(((Doctor2)emp1).specialization);

//        ((Doctor2)h).help();
//        ((Doctor2)h).cure();

//        System.out.println(emp.equals(emp1));

        //-------------------------------------

        Employee2[] array = {emp1, emp2, emp3, emp};
        for (Employee2 e : array) {
            if(e instanceof Driver2) {
                System.out.println(((Driver2)e).nameOfCar);
//                ((Driver2).e).drive();
            }
        }




    }
}

class Employee2 {
    double salary = 100;
    String name = "Nikolay";
    int age;
    int experience;

    void eat(){
        System.out.println("Nyam-nyam");
    }
    void sleep(){
        System.out.println("Hrrrrr");
    }
}

class Doctor2 extends Employee2 implements Help_Able {
    String specialization = "Hirurg";
    void cure(){System.out.println("Healthing");}
    public void help(){System.out.println("Doctor is Helping");}
}

class Teacher2 extends Employee2 {
    int countOfStudents;
    void teach(){
        System.out.println("Teaching");
    }
}

class Driver2 extends Employee2 {
    String nameOfCar = "Mercedes";
    public void drive(){
        System.out.println("Drive");
    }
}
interface Help_Able {
    void help();
}