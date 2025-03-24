package javastandart.lesson13;

public class Main {



    public static void main(String[] args) {

        Student s1 = new Student(3);

//        if (s1.grade == 2) {
//            System.out.println("Student has grase is 2!");
//        } else if (s1.grade == 3) {
//            System.out.println("Student has grase is 3!");
//        } else if (s1.grade == 4) {
//            System.out.println("Student has grase is 4!");
//        } else if (s1.grade == 5) {
//            System.out.println("Student has grase is 5!");
//        } else {
//            System.out.println("Incorrect grade!");
//        }

        switch(s1.grade) {
            case 2: System.out.println("Student has grase is 2!");
            break;
            case 3: System.out.println("Student has grase is 3!");
            break;
            case 4: System.out.println("Student has grase is 4!");
            break;
            case 5: System.out.println("Student has grase is 5!");
            break;
            default: System.out.println("Incorrect grade!");
        }

    }
}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }
}