package udemy.lesson5;

import udemy.lesson4.Student;

public class Main {
    public static void main(String[] args) {

        //---------------------Task 1
        BankAccount bankAccount = new BankAccount();
        bankAccount.balance = 700.00;
        bankAccount.popolnenieScheta(203.00);
        System.out.println(bankAccount.balance);
        System.out.println();

        bankAccount.snyatieSoScheta(625.00);
        System.out.println(bankAccount.balance);
        System.out.println();

        //---------------------Task 2
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setData(1, "Mike", "Ford", 2022);
        System.out.println("Student: " + student1.name + " " + student1.lastname + " has average grade of " + student1.getAverageGrade(4.0, 5.0, 2.0));
        System.out.println();
        student2.setData(2, "Bob", "Mask", 2021);
        System.out.println("Student: " + student2.name + " " + student2.lastname + " has average grade of " + student2.getAverageGrade(3.0, 2.0, 3.0));
        System.out.println();
        student3.setData(3, "Anna", "Bolein", 2007);
        System.out.println("Student: " + student3.name + " " + student3.lastname + " has average grade of " + student3.getAverageGrade(5.0, 5.0, 3.0));
        System.out.println();

        //---------------------Task 3
        Employee empl1 = new Employee(1, "Bob", 25, 42000.00, "Developer");
        System.out.println(empl1.setSalary());
        System.out.println();

        Employee empl2 = new Employee(2, "Mike", 28, 51500.36, "PM");
        System.out.println(empl2.setSalary());
    }
};

class BankAccount {
    Double balance;
    public double popolnenieScheta(Double newSum) {
        return balance += newSum;
    }
    public double snyatieSoScheta(Double newSum) {
        return balance -= newSum;
    }
}

class Employee {
    Integer id;
    String surname;
    Integer age;
    Double salary;
    String department;

    public Employee(Integer id, String surname, Integer age, Double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String setSalary() {
        return String.format("%.2f", (this.salary *= 2));
    }

}

