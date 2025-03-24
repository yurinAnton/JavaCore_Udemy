package udemy.lesson25;

public class Test1 {
    public static void main(String[] args) {

        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Help_Able h = new Teacher();
//        emp1.work();
////        emp1.help();
//        emp2.work();
//        emp3.work();

//        Driver [] array1 = {new Driver(), new Driver()};
//        Employee [] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
//        Help_Able [] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};

        Employee [] array2 = {emp1, emp2, emp3};
        for(Employee emp : array2) {
            emp.work();
        }


        System.out.println(emp1 instanceof Teacher);

        String s1 = null;
        System.out.println(s1 instanceof String);


    }
}

abstract class Employee {
    void sleep(){
        System.out.println("Employee sleeps!");
    }
    abstract void work();
}

class Teacher extends Employee implements Help_Able{
    void work(){System.out.println("Teacher works!");}
    public void help(){System.out.println("Teacher helps");}
}

class Driver extends Employee implements Help_Able{
    void work(){System.out.println("Driver works!");}
    public void help(){System.out.println("Driver helps");}
}

class Doctor extends Employee implements Help_Able{
    void work(){System.out.println("Doctor works!");}
    public void help(){System.out.println("Doctor helps");}
}

//interface Help_Able {
//    void help();
//}

