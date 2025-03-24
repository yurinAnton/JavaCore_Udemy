package udemy_advance.less11_Enum_Scaner_Anno.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        // 3- варианта создания класса
//        Class employeeClass1 = Class.forName("Reflection.Employee");
        Class employeeClass = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();



        Field field = employeeClass.getField("id");
        System.out.println("Type of id field: " + field.getType());
        System.out.println("-------------------------------------------");

       Field[] fields = employeeClass.getFields();
       for (Field f : fields) {
           System.out.println("Field: " + f.getName() + " and Type: " + f.getType());
       }
        System.out.println("-------------------------------------------");

//        Field [] allFields = employeeClass.getDeclaredField();
//       for (Field f : allFields) {
//           System.out.println("Field: " + f.getName() + " and Type: " + f.getType());
//       }
//        System.out.println("-------------------------------------------");


        Method method = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Type of method: " + method.getReturnType()
                + " / -and parameter Types: " + Arrays.toString(method.getParameterTypes()));
        System.out.println("-------------------------------------------");


        Method[] methods =  employeeClass.getMethods();
        for (Method m : methods) {
            System.out.println("Name of method: " + m.getName()
                    + " / -and return Type: " + m.getReturnType()
                    + " / -and parameters Types: " + Arrays.toString(m.getParameterTypes()));
        }
        System.out.println("-------------------------------------------");

        Method[] allMethods =  employeeClass.getDeclaredMethods();
        for (Method m : allMethods) {
            System.out.println("Name of method: " + m.getName()
                    + " / -and return Type: " + m.getReturnType()
                    + " / -and parameters Types: " + Arrays.toString(m.getParameterTypes()));
        }
        System.out.println("-------------------------------------------");

        Method[] allMethods2 =  employeeClass.getDeclaredMethods();
        for (Method m : allMethods2) {
            if(Modifier.isPublic(m.getModifiers())) {
                System.out.println("Name of method: " + m.getName()
                        + " / -and return Type: " + m.getReturnType()
                        + " / -and parameters Types: " + Arrays.toString(m.getParameterTypes()));
            }
        }
        System.out.println("-------------------------------------------");

        Constructor constr = employeeClass.getConstructor();
        System.out.println("All parameters Types: " + Arrays.toString(constr.getParameterTypes())
        + " / -types of param: " + constr.getParameterTypes()
        + " / -count of param: " + constr.getParameterCount());
        System.out.println("-------------------------------------------");

        Constructor constr2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("All parameters Types: " + Arrays.toString(constr2.getParameterTypes())
                + " / -types of param: " + constr2.getParameterTypes()
                + " / -count of param: " + constr2.getParameterCount());
        System.out.println("-------------------------------------------");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println("Constructor: " + c.getName()
                    + " / -count of param: " + c.getParameterCount()
                    + " / -types of param: " + Arrays.toString(c.getParameterTypes()));
        }


    }
}
