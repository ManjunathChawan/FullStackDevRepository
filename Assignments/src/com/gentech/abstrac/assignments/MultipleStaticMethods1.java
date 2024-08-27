package com.gentech.abstrac.assignments;

abstract class Utility {
    // Static method 1
    public static void printHello() {
        System.out.println("Hello, Manjunath!");
    }

    // Static method 2
    public static void printNumber(int number) {
        System.out.println("The number is: " + number);
    }

    // Static method 3
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Abstract method (cannot have a body)
    public abstract void someAbstractMethod();
}

public class MultipleStaticMethods1 {
    public static void main(String[] args) {
        Utility.printHello();
        Utility.printNumber(42);
        int sum = Utility.addNumbers(10, 20);
        System.out.println("Sum is: " + sum);
    }
}

