package udemy_advance.less11_Enum_Scaner_Anno.Enums;



public class Test1 {

    void method(String dayOfWeek){
        System.out.println("Day is " + dayOfWeek);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.method("Monday");
    }
}
