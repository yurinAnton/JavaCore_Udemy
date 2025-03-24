package udemy_advance.less4_NestedClass.Static_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method(){
        System.out.println("Count of objects: " + Engine.countObjects);
        Engine e = new Engine(200);
        System.out.println("Horse Power: " + e.horsePower);
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        int horsePower;
        static int countObjects;

        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.horsePower = horsePower;
            countObjects ++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

}

class Test{
    public static void main(String[] args) {

        Car.Engine e = new Car.Engine(256);
        System.out.println(e);

        Car c = new Car("red", 2, e);
        System.out.println(c);

    }
}