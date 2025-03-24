package udemy_advance.less11_Enum_Scaner_Anno.Annotation;

public class Test1 {
    public static void main(String[] args) {

        Parent p = new Child("Anton");
        p.showInfo();


    }
}

class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated
    void showInfo(){
        System.out.println("Name of Parent.class: " + name);
    }

}


class Child extends Parent{

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo(){
        System.out.println("Name of Child.class: " + name);
    }
}

