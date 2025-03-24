package udemy.lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName(Student s1){
        s1.name = "Phillip";
    }


    public static void main(String[] args) {
        Student st1 = new Student("John", 3, 9.5);
        Student st2 = new Student("Mike", 1, 6.3);
//        System.out.println(st1.name);
//        swap(st1, st2);
//        System.out.println(st1.name);

        changeName(st2);
        System.out.println(st2.name);
    }
}
