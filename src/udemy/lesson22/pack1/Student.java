package udemy.lesson22.pack1;
import udemy.lesson22.*;

public class Student extends Human {
    public Student(String gender) {
        super(gender);
    }

    public static void main(String[] args) {
        Student s1 = new Student("male");
    }
}
