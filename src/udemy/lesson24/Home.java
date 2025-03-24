package udemy.lesson24;

public class Home {
    public static void main(String[] args) {

        Mechenosec mech = new Mechenosec("Karl");
        System.out.println(mech.name);
        mech.swim();
        mech.eat();
        mech.sleep();
        System.out.println();

        Speakable ping = new Pingvin("Pingviny");
        ping.speak();
        System.out.println();

        Animal2 li = new Lion("Leva");
        System.out.println(li.name);
        li.eat();
        li.sleep();
        System.out.println();

        Mammal li2 = new Lion("Leva-second");
        System.out.println(li2.name);
        li2.eat();
        li2.sleep();
        li2.run();
        li2.speak();

    }
}

abstract class Animal2 {
    String name;
    Animal2(String name) { this.name = name; }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal2 {
    String name;
    Fish(String name){
        super(name);
        this.name = name;
    };
    void sleep(){System.out.println("It's always interesting to watch how fishes sleeps");}
    abstract void swim();
}

abstract class Bird extends Animal2 implements Speakable {
    String name;
    Bird(String name) {
        super(name);
        this.name = name;}
    abstract void fly();
    public void speak(){System.out.println(name + " - sings");}
}

abstract class Mammal extends Animal2 implements Speakable {
    String name;
    Mammal(String name) {
        super(name);
        this.name = name;}
    abstract void run();
    public void speak(){System.out.println(name + " - sings");}
}

class Mechenosec extends Fish{
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }
    public void swim(){System.out.println("Mechenosec -" + this.name + " swims");}
    public void eat(){System.out.println("Mechenosec -" + this.name + " eating");}
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }
    public void fly(){System.out.println("Pingvins can't fly");};
    public void eat(){System.out.println("Pingvin likes to eat fish");}
    public void sleep(){System.out.println("Pingvins sleep close each others");}
    public void speak(){System.out.println("Pingvins can't sing like nightingale");}
}

class Lion extends Mammal{
    Lion(String name) {
        super(name);
        this.name = name;
    }
    public void eat(){System.out.println("Lions likes to eat meat");}
    public void sleep(){System.out.println("Lions sleep almost all day");}
    public void run(){System.out.println("Lions can run very fast");}
}


interface Speakable{
    default void speak(){System.out.println("Somebody speaking");};
}

