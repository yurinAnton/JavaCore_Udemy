package udemy.lesson22.pack1;

public class Test3 {
}

class Human2{

    String name;
    String surname;

    Human2(String n, String s){
        n = name;
        s = surname;
        System.out.println("Human2 constructor1 (String String)");
    }
    Human2(String n){
        this(n, null); // - обращается к конструкктору с 2мя параметрами
        System.out.println("Human2 constructor2 (String)");
    }

}

class Student2 extends Human2{
    Student2(){
        super("Bob"); // - обращается к конструктору родителя
        System.out.println("Student2() constructor1");
    }

    Student2(int i){
        this(); // - обращается к конструктору Student2 без аргументов
        System.out.println("Student2(int) constructor2");
    }

    public static void main(String[] args) {

        Student2 st = new Student2(5);


    }
}

// - output
//Human2 constructor1 (String String)
//Human2 constructor2 (String)
//Student2() constructor1
//Student2(int) constructor2