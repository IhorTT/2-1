package net.ukr.tigor;

import org.jetbrains.annotations.Contract;

public class Calc {
    @TestAnnotation(numA = 5,numb = 8)
    public static int sum(int a, int b){
        return a + b;
    }

    public static int mult(int a, int b){
        return a * b;
    }
}
