package udemy.lesson9;



public class Car {

    String color;
    String engine;
    static int count;
    public static int a = 10;

    public Car(String color, String engine) {
        this.count++;
        this.color = color;
        this.engine = engine;
    }

    public void shwColor(){
        System.out.println("Color of car: " + color);
        this.chhangeColor("red");
    }

    public void chhangeColor(String color3){
        System.out.println("Color changed: " + color3);
        int price = 5000;
        this.color = color3;
        price += 1000;
    }

    public static void main(String[] args) {

        Car c = new Car("red", "V8");
        System.out.println(c.color);
        c.chhangeColor("black");
        System.out.println(c.color);


    }

}
