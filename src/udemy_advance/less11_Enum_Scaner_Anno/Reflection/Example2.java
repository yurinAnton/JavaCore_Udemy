package udemy_advance.less11_Enum_Scaner_Anno.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class employeeClass = Employee.class;


        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(1, "Anton", "IT");
        System.out.println(obj2);

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 250000.50);
        System.out.println(obj2);




    }

}
