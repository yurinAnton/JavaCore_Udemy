package udemy_advance.less11_Enum_Scaner_Anno.Reflection;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    void sum(int a, int b) {
        System.out.println("Summ is: " + (a + b));
    }

    void subtraction(int a, int b) {
        System.out.println("Different is: " + (a - b));
    }

    void multi(int a, int b) {
        System.out.println("Multiply is: " + (a * b));
    }

    void division(int a, int b) {
        System.out.println("Division is: " + (a / b));
    }

}

class testCulc{
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("./test.txt"))) {

            String methodName = reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;

            Method[] methods = cl.getDeclaredMethods();
            for(Method m : methods){
                if(m.getName().equals(methodName)){
                    method = m;
                }
            }

            method.invoke(calculator, Integer.parseInt(line2), Integer.parseInt(line3));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}

