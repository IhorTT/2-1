package net.ukr.tigor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class myClass = Calc.class;
        Method[] methodsMyClass = myClass.getMethods();
        for (Method meth : methodsMyClass) {
            if (meth.isAnnotationPresent(TestAnnotation.class)){
                System.out.println("Method: " + meth.getName());
                TestAnnotation test = meth.getAnnotation(TestAnnotation.class);
                try {
                    int result = (Integer) meth.invoke(null,test.numA(),test.numb());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
