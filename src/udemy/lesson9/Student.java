package udemy.lesson9;

public class Student {
    int a = 10;

    int b = this.a;
    public static int c = 5;
    public int z = this.c;
    static int f = c;


}

class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s2.z);
        System.out.println(Student.c);

        Student s3; // - пустая ссылка

        s1 = null; // - теряется ссылка на объект
        s1 = new Student(); // - создаем новую ссылку на другой объект, старый объект стирается после завершения

    }
}


