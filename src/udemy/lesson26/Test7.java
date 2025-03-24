package udemy.lesson26;

public class Test7 {
    public static void main(String[] args) {

//        Animal an  = new Animal();
        Lion l  = new Lion();

    }
}

class Animal{
    Animal() {System.out.println("Constructor of Animal");}
    static { System.out.println("Static block of Animal");}
    { System.out.println("Non-Static block of Animal");}
}

class Mummal extends Animal{
    Mummal() {System.out.println("Constructor of Mummal");}
    static { System.out.println("Static block of Mummal");}
    { System.out.println("Non-Static block of Mummal");}
}

class Lion extends Mummal{
    Lion() {System.out.println("Constructor of Lion");}
    static { System.out.println("Static block of Lion");}
    { System.out.println("Non-Static block of Lion");}
}