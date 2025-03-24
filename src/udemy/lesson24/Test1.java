package udemy.lesson24;

public class Test1 {
    public static void main(String[] args) {

//        Figure f = new Figure();

        Figure f1 = new Square();
        System.out.println(f1.countOfside);
        f1.area();

    }
}

abstract class Figure{
//    Figure(int countOfside){
//        this.countOfside = countOfside;
//    }

    int countOfside = 0;

    abstract void perimeter();
    abstract void area();
    void showInfo(){
        System.out.println("This is figure");
    }
}

class Square extends Figure{
    int countOfside = 4;
    int side1 = 10;

//    Square(int countOfside){
//        super(countOfside);
//        this.countOfside = countOfside;
//    }

    public void perimeter(){
        System.out.println("Perimeter of Square = " + side1*countOfside);
    }
    public void area(){
        System.out.println("Area of Square = " + side1*side1);
    }
}

class Rectangle extends Figure{
//    Rectangle(int countOfside){
//        super(countOfside);
//        this.countOfside = countOfside;
//    }

    int countOfside = 3;
    int side1 = 10;
    int side2 = 15;
    int side3 = 8;
    double corn = 30.5;

    public void perimeter(){
        System.out.println("Perimeter of Rectangle = " + side1+side2+side3);
    }
    public void area(){
        System.out.println("Area of Rectangle = " + 0.5 * side1 * side2 * Math.asin(corn));
    }

}
class Circle extends Figure{
//    Circle(int countOfside){
//        super(countOfside);
//        this.countOfside = countOfside;
//    }
    int radius = 6;
    double p = 3.14;

    public void perimeter(){
        System.out.println("Length of Circle = " + 2 * p * radius);
    }
    public void area(){
        System.out.println("Area of Circle = " + p * radius * radius);
    }
}

abstract class Octogon extends Figure{

    void def(){
        System.out.println("Octogon");
    }
}





