package udemy_advance.less1_compare;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {

        List<Employee2> list2 = new ArrayList<Employee2>();

        Employee2 emp1 = new Employee2(100, "Ivan", "Ivanov", 20000);
        Employee2 emp2 = new Employee2(15, "Roman", "Petrov", 30000);
        Employee2 emp3 = new Employee2(123, "Mike", "Klouny", 15000);


        list2.add(emp1);
        list2.add(emp2);
        list2.add(emp3);
        System.out.println("Before sorting:");
        System.out.println(list2);
//        Collections.sort(list2, new idComparator());
//        Collections.sort(list2, new NameComparator());
        Collections.sort(list2, new SalaryComparator());

        System.out.println("After sorting:");
        System.out.println(list2);


    }

}

class Employee2 implements Comparable<Employee2>  {
    int id;
    String name;
    String surname;
    int salary;

    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
    }


    @Override
    public int compareTo(Employee2 e) {
        if (this.id == e.id) {
            return 0;
        } else if (this.id < e.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class idComparator implements Comparator<Employee2> {

    public int compare(Employee2 emp1, Employee2 emp2) {
        // examp - 1
        if(emp1.id == emp2.id) {
            return 0;
        } else if(emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee2> {

    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee2> {

    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.salary-emp2.salary;
    }
}