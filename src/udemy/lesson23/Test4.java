package udemy.lesson23;

public class Test4 {
    public static void main(String[] args) {

        Mouse2 m = new Mouse2();
        Animal2 a = new Animal2();
        m.showInfoAnimal();
        a.showInfoAnimal();
        m.showInfoMouse();

    }
}

class Animal2{

     String showName(){
        return "Animal2";
    }
    void showInfoAnimal(){
        System.out.println("Name of animal: " + showName());
    }
}


class Mouse2 extends Animal2{
     String showName(){
        return "Jerry";
    }
    void showInfoMouse(){
        System.out.println("Name of mouse: " + showName());
    }
}