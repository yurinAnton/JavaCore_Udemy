package udemy.lesson25;

public class Home {
    public static void main(String[] args) {

        Animal2 an1 = new Mechenosec("Chuck-1");
        Animal2 an2 = new Pingvin("Karl-1");
        Animal2 an3 = new Lion("Leva-1");
        Fish f1 = new Mechenosec("Chuck-2");
        Bird b1 = new Pingvin("Karl-2");
        Mammal m1 = new Lion("Leva-2");
        Mechenosec mech1 = new Mechenosec("Chuck-3");
        Pingvin p1 = new Pingvin("Karl-3");
        Lion l1 = new Lion("Leva-3");
        Speakable s1 = new Pingvin("Karl-4");
        Speakable s2 = new Lion("Leva-4");

        Animal2[] array1 = new Animal2[] {an1, an2, an3, f1, b1, m1, mech1, p1, l1};
        Speakable[] array2 = new Speakable[] {s1, s2, b1, m1, p1, l1};

        for(Animal2 a : array1){
            if(a instanceof Mechenosec){
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.swim();
                m.sleep();
            } else if(a instanceof Pingvin){
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if(a instanceof Lion){
                Lion l = (Lion) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("--------------------------------------");
        }
        for(Speakable s : array2){
            if(s instanceof Pingvin){
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if(s instanceof Lion){
                Lion l = (Lion) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("--------------------------------------");
        }

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

class Mechenosec extends Fish {
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

class Lion extends Mammal {
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

