package udemy.lesson24;

public class Test3 {
    public static void main(String[] args) {
        Jumpable j1 = new Human();
        Jumpable j2 = new Animal();

    }
}

class Human implements Jumpable {
public void jump() {
    System.out.println("Human jump");
}
}
class Animal implements Jumpable {
public void jump() {
    System.out.println("Animal jump");
}
}

interface Jumpable{
void jump();
}
interface A2{ void abc();}
interface B2 extends A2, Jumpable{ void def();}

abstract class D implements A2, B2{}
