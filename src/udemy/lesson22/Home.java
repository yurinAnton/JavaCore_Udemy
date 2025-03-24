package udemy.lesson22;

public class Home {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName(new StringBuilder("Frank"));
        s1.setCourse(2);
        s1.setGrade(10);
//        s1.showInfo();

        //------------------------------------

        Dog dog = new Dog("Pluto");
        Cat cat = new Cat("Kitty");

        System.out.println(dog.paw);
        cat.sleep();
    }

}

class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        return name;
    }
    public void setName(StringBuilder name) {
        if(name.length() > 3) {
            this.name = name;
        }
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        if(0 < course && course <= 4){
            this.course = course;
        }
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        if(grade > 0 && grade <= 10){
            this.grade = grade;
        }
    }
    public void showInfo(){
        System.out.println("Student: " + this.getName() + "\nCourse: " + this.getCourse() + "\nGrade: " + this.getGrade());
    }

}

//-----------------------------------------------------------------

class Animal{
    final int eyes = 2;

    Animal(){
        System.out.println("I'm Animal");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal{
    String name;
    final int tail = 1;
    final int paw = 4;

    Pet(){
        System.out.println("I'm Pet");
    }
    void run(){
        System.out.println("Pet runs");
    }
    void jump(){
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet{
    Dog(String name){
        System.out.println("I'm Dog and my name is " + name);
    }
    void play(){
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{
    Cat(String name){
        System.out.println("I'm Cat and my name is " + name);
    }
    void sleep(){
        System.out.println("Cat sleeps");
    }
}

