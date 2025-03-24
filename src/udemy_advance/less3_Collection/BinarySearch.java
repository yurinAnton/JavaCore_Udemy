package udemy_advance.less3_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(8);
        list.add(12);
        list.add(-8);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(150);
        list.add(-30);
        list.add(19);
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

//        int index1 = Collections.binarySearch(list, 12);
//        System.out.println(index1);


//        Employee emp1 = new Employee(100, "Zaur", 21000);
//        Employee emp2 = new Employee(15, "Ivan", 34500);
//        Employee emp3 = new Employee(123, "Petr", 15000);
//        Employee emp4 = new Employee(53, "Maria", 17300);
//        Employee emp5 = new Employee(186, "Nikola", 9400);
//        Employee emp6 = new Employee(15, "Anna", 20600);
//        Employee emp7 = new Employee(250, "Elena", 16700);
//        List<Employee> empList = new ArrayList<Employee>();
//        empList.add(emp1);
//        empList.add(emp2);
//        empList.add(emp3);
//        empList.add(emp4);
//        empList.add(emp5);
//        empList.add(emp6);
//        empList.add(emp7);
//        System.out.println(empList);
//        Collections.sort(empList);
//
//        System.out.println(empList);
//
//        int index = Collections.binarySearch(empList, new Employee(186, "Nikola", 9400));
//        System.out.println(index);


    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}


