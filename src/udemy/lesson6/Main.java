package udemy.lesson6;


public class Main {
    public static void main(String[] args) {

        //---------------------Task 1
        SomeClass cl = new SomeClass();
        cl.method();
        cl.method(1);
        cl.method(1, 2);
        cl.method(1, 2, 3);
        cl.method(1, 2, 3, 4);

        //---------------------Task 2
        Student s1 = new Student(1, "Bob", "Mcmillan", 2015, 3);
        Student s2 = new Student(2, "Rob", "Runy", 2);
        Student s3 = new Student();

    }
}

class SomeClass {
    public void method() {
        System.out.println(0);
    }
    public void method(Integer count1) {
        System.out.println(count1);
    }
    public void method(Integer count1, Integer count2) {
        System.out.println(count1 + count2);
    }
    public void method(Integer count1, Integer count2, Integer count3) {
        System.out.println(count1 + count2 + count3);
    }
    public void method(Integer count1, Integer count2, Integer count3, Integer count4) {
        System.out.println(count1 + count2 + count3 + count4);
    }
}



class Student{
    public Integer idCard;
    public String name;
    public String lastname;
    public Integer studyYear;
    public Integer course;

    public Student(Integer idCard, String name, String lastname, Integer studyYear, Integer course) {
        this.idCard = idCard;
        this.name = name;
        this.lastname = lastname;
        this.studyYear = studyYear;
        this.course = course;
    }
    public Student(Integer idCard, String name, String lastname, Integer course) {
        this.idCard = idCard;
        this.name = name;
        this.lastname = lastname;
        this.course = course;
    }
    public Student() {
    }
}