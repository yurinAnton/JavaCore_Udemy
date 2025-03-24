package udemy.lesson11;

public class Car {
    String color;
    String engine;
    int doors;

    public void changeDoors(Integer door) {
        this.doors = door;
    }

    public static void changeColor(Car cr1, Car cr2) {
        String color = cr1.color;
        cr1.color = cr2.color;
        cr2.color = color;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.doors = 4;
        c1.color = "red";
        c2.color = "blue";

        c1.changeDoors(5);
        System.out.println(c1.doors);

        System.out.println(c1.color);
        System.out.println(c2.color);
        System.out.println();

        changeColor(c1, c2);
        System.out.println(c1.color);
        System.out.println(c2.color);
    }
}
