package udemy_advance.less1_compare;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {

//        List<String> list = new ArrayList();
//
//        list.add("Ivan");
//        list.add("Maria");
//        list.add("Anton");
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);

        List<Employee> list = new ArrayList<>();

        Employee emp1 = new Employee(100, "Ivan", "Ivanov", 20000);
        Employee emp2 = new Employee(15, "Roman", "Petrov", 30000);
        Employee emp3 = new Employee(123, "Mike", "Klouny", 45000);

//        Arrays.sort(new Employee[]{emp1, emp2, emp3}); // - runtime exception

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting:");
        System.out.println(list);
        Collections.sort(list);

        System.out.println("After sorting:");
        System.out.println(list);


    }

}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        // examp - 1
//        if(this.id == anotherEmp.id) {
//            return 0;
//        } else if(this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }

        // examp - 2
//        return this.id - anotherEmp.id;

        // examp - 3
//        return this.id.compareTo(anotherEmp.id);

        // examp - 4
//        return this.name.compareTo(anotherEmp.name);

        // examp - 5
        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;

    }
}