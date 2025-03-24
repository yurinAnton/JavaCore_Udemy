package udemy.lesson29;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("Mike", 'm', 28, 2, 8.3);
        Student s2 = new Student("Bob", 'm', 25, 1, 6.4);
        Student s3 = new Student("Anna", 'f', 26, 1, 6.2);
        Student s4 = new Student("Gorge", 'm', 22, 4, 9.5);
        Student s5 = new Student("Linda", 'f', 24, 3, 5.2);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        StudentInfo si = new StudentInfo();
        si.printStudentOverGrade(list, 8.2);
        System.out.println("------------------------------------------------------------------------");
        si.printStudentUnderGrade(list, 8.2);
        System.out.println("------------------------------------------------------------------------");
        si.printStudentOverAge(list, 24);
        System.out.println("------------------------------------------------------------------------");
        si.printStudentUnderAge(list, 27);
        System.out.println("------------------------------------------------------------------------");
        si.printStudentBySex(list, 'm');
        System.out.println("------------------------------------------------------------------------");
        si.printStudentMixConditions(list, 4.2, 28, 'f');


    }
}

class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

}

class StudentInfo{
    void printStudent(Student s){
        System.out.println("Name of student: " + s.name + ", gender: " + s.sex + ", age: " + s.age + ", course: " + s.course + ", avgGrade: " + s.avgGrade);
    }
    void printStudentOverGrade(ArrayList<Student> sts, double avgGrade){
        for(Student s : sts){
            if(s.avgGrade > avgGrade){
                printStudent(s);
            }
        }
    }
    void printStudentUnderGrade(ArrayList<Student> sts, double avgGrade){
        for(Student s : sts){
            if(s.avgGrade < avgGrade){
                printStudent(s);
            }
        }
    }
    void printStudentOverAge(ArrayList<Student> sts, int age){
        for(Student s : sts){
            if(s.age > age){
                printStudent(s);
            }
        }
    }
    void printStudentUnderAge(ArrayList<Student> sts, int age){
        for(Student s : sts){
            if(s.age < age){
                printStudent(s);
            }
        }
    }
    void printStudentBySex(ArrayList<Student> sts, char sex){
        for(Student s : sts){
            if(s.sex == sex){
                printStudent(s);
            }
        }
    }
    void printStudentMixConditions(ArrayList<Student> sts, double avgGrade, int age, char sex){
        for(Student s : sts){
            if(s.avgGrade > avgGrade && s.age < age && s.sex == sex){
                printStudent(s);
            }
        }
    }

}
