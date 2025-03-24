package udemy_advance.less4_NestedClass.Inner_class;



public class Car {
    String color;
    int doorCount;
    Engine engine;
    Engine e = new Engine(200);
//    System.out.println(e.horsePower);


    public Car(String color, int doorCount
//            , int horsePower
    ) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My Car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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

        Car car = new Car("red", 5);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);


        Car.Engine engine2 = new Car("black", 4).new Engine(200);

    }
}
