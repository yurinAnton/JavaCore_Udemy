package udemy.lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double multy(Double a){
        return a *= 2;
    }

    public double zp(){
        return salary *= 3;
    }

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 500.55);
        System.out.println("Salary is: " + e1.salary + " and multy - " +  e1.multy(e1.salary));
        e1.zp();
        System.out.println(e1.salary);
    }
}