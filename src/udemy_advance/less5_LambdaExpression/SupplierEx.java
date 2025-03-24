package udemy_advance.less5_LambdaExpression;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class SupplierEx {

    public static ArrayList<Car> createCars(Supplier<Car> supp) {

        ArrayList<Car> cars = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            cars.add(supp.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> cons) {
        cons.accept(car);
    }

    public static void main(String[] args) {

        ArrayList<Car> myCars = createCars(() -> new Car("Nissan", "red", 2.5));
        System.out.println(myCars);
        System.out.println("------------------------------------");

        changeCar(myCars.get(0), car -> {car.color = "black"; car.engine = 3.5;
            System.out.println("Car was upgraded: " + car);});

    }

}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
