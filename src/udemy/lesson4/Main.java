package udemy.lesson4;

public class Main {
    public static void main(String[] args) {

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
        System.out.println("Student: " + student3.name + " " + student3.lastname + " has average grade of " + student3.getAverageGrade(5.0, 5.0, 4.0));

    }
}












