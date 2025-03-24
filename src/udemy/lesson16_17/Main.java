package udemy.lesson16_17;

// isBlank
// isEmpty
// strip, stripLeading, stripTrailing



public class Main {

//    final static Car car = new Car("red", "V8");

    public static void main(String[] args) {

//        String s1 =  new String("Hello");
//        String S2 = "Hello";
//
//        Car c = new Car("red", "V4");
//        Car c2 = c.abc("black");
//        System.out.println(c.color);

//        String s1 =  new String("Hello world, Hello!");

//        System.out.println(s1.length());
//        System.out.println(s1.charAt(0));
//
//        System.out.println(s1.indexOf("lo"));
//        System.out.println(s1.indexOf("lo", 5));
//
//        System.out.println(s1.startsWith(" ", 5));
//
//        System.out.println(s1.substring(5, 19));
//
//        System.out.println(s1.replace("Hello", "hi"));

//        int a = 5;
//        int b = 6;
//        String s = "ok";
//
//        System.out.println("" + (a + b) + s);


//        Employee emp = new Employee(100.50, true);
//        System.out.println("He is a manager? - " + emp.isManager + " He has salary - " + emp.salary);
//
//        System.out.println(s1.contains("Hello"));

//        String s2 =  "Hi, whats up!";
//        String s3 = "My name is John";
//        String s4 = s1.concat(s2).trim().replace("Hi", "Hello").substring(6, 18) + s3;
//        System.out.println(s4);

        //-------------------------

        String str1 = "Чтоб мудро жизнь прожить, знать надобно не мало, два важных правила запомни для начала: " +
                "лучше голодай, чем что попало есть. И лучше будь один, чем вместе с кем попало.";

        String str2 = str1.toUpperCase();
        char c1;
        char c2;

        for (int i = 0; i < str1.length(); i++) {
            c1 = str1.charAt(i);
            c2 = str2.charAt(i);

            if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();

        //--------------------------

        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2);  // false
        System.out.println(s1.equals(s2)); // true

        String s3 = "ok";
        String s4 = "ok";
        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true
        System.out.println();

        String s5 = "Hello World";
        String s6 = "hello world";
        System.out.println(s5.equalsIgnoreCase(s6)); // true
        System.out.println();

        String x = "hello";
        String y = "hello".trim();
        System.out.println(x == y); // true т.к. действий со строкой не было


        //--------------------Lesson 17

//        String s1 = "hello";
//        System.out.println(s1.isBlank());
//        String s2 = "   ";
//        System.out.println(s2.isBlank());

//        String s3 = "";
//        System.out.println(s3.isEmpty());

//        String s4 = "    hello   ";
//        System.out.println(s4.strip());
//        System.out.println(s4.stripLeading());
//        System.out.println(s4.stripTrailing());


    }
}

class Car{
    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    final static int a = 5;

    public Car abc(String col) {
        Car c10 = new Car(col, "V6");
        return c10;
    }
}

class Employee{
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}