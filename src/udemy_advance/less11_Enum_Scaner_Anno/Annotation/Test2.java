package udemy_advance.less11_Enum_Scaner_Anno.Annotation;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class xiaomiClass = Xiaomi.class;
        Annotation anno1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone1 = (SmartPhone) anno1;
        System.out.println("Annotation info for Xiaomi: " + smartPhone1.OS() + ", year " + smartPhone1.yearOfCreation());
        System.out.println("-----------------------------------");

        Class iphoneClass = Iphone.class;
        Annotation anno2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone2 = (SmartPhone) anno2;
        System.out.println("Annotation info for Iphone: " + smartPhone2.OS() + ", year " + smartPhone2.yearOfCreation());


    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "android";
    int yearOfCreation() default 0;
}


@SmartPhone(yearOfCreation=2010)
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS="IOS", yearOfCreation=1976)
class Iphone{
    String model;
    double price;
}

