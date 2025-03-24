package udemy.lesson23;

public class Test2 {
    void abc(Animal a){
        System.out.println("An");
    }
    void abc(Mouse m){
        System.out.println("Ms");
    }

    public static void main(String[] args) {

        Test2 t = new Test2();
        Animal an = new Mouse();
//        t.abc(an);
        an.getName();
    }
}

class Animal{
    void getName(){
        System.out.println("Animal");
    }
}
class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }
}