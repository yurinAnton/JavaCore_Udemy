package udemy.lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HomeW {
    public static void main(String[] args) {

        ArrayList<Employee> list2 = new ArrayList<>();
        Employee e1 = new Employee("Mike", "HR", 100.50);
        Employee e2 = new Employee("Bob", "IT", 250.00);
        Employee e3 = new Employee("Anna", "HED", 400.30);
        Employee e4 = new Employee("Gorge", "IT", 300.50);
        Employee e5 = new Employee("Elena", "QA", 500.50);
        list2.add(e1);
        list2.add(e2);
        list2.add(e3);
        list2.add(e4);
        list2.add(e5);
        TestEmployee te = new TestEmployee();

        te.filterEmployee(list2, (Employee e) -> {return e.department == "IT" && e.salary > 200;});
        System.out.println("------------------------------------------------------------------------");
        te.filterEmployee(list2, (Employee e) -> {return e.name.startsWith("E") && e.salary != 450;});
        System.out.println("------------------------------------------------------------------------");
        te.filterEmployee(list2, (Employee e) -> {return e.name == e.department;});
        System.out.println("------------------------------------------------------------------------");

    }
}

class Employee{
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee{
    void printEmployee(Employee emp){
        System.out.println("Employee Name: " + emp.name + ", Department: " + emp.department + ", Salary: " + emp.salary);
    }
    void filterEmployee(ArrayList<Employee> list, Predicate<Employee> p){
        for(Employee e : list){
            if(p.test(e)){
                printEmployee(e);
            }
        }
    }
}
