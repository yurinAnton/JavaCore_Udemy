package udemy.lesson7;

public class Employee {
    Integer id;
    public String surname;
    private Double salary;

    public void getId() {
        System.out.println(this.id);;
    }
    public void getSurname() {
        System.out.println(surname);;
    }
    public void getSalary() {
        System.out.println(salary);;
    }

    Employee(Integer id) {
        this.id = id;
    }
    public Employee(String surname) {
        this.surname = surname;
    }
    private Employee(Double salary) {
        this.salary = salary;
    }

}
