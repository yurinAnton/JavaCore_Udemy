package udemy.lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("white", "V8");
        Car c4 = new Car("white", "V8");

        ArrayList<Car> list = new ArrayList<Car>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
//        System.out.println(list.contains(c4));


//        System.out.println(c1==c2);
//        System.out.println(c1.equals(c2));

//        System.out.println(c1.equals(null));

        System.out.println(c1.toString());
        System.out.println(c2);
        System.out.println(c3);

    }
}

class Car{
    String color;
    String engine;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    public boolean equals (Object obj){
        if (obj instanceof Car){
            Car c2 = (Car)obj;
            return (color.equals(c2.color) && engine.equals(c2.engine));
        } else return false;
    }
    public String toString(){
        return "Car has color - " + color + ", and engine - " + engine;
    }
}


