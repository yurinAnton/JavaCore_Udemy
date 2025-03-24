package udemy_advance.less11_Enum_Scaner_Anno.Reflection;

import java.lang.reflect.Field;

public class Example3 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        Employee employee = new Employee(10, "Anton", "IT");
        Class employeeClass = employee.getClass();

        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (Double)field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, salaryValue + 1500);
        System.out.println(employee);




    }
}
