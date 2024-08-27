package com.gentech.polymorphism.assignments;

abstract class BasicMathematicalOperations{
    abstract void mathematicalOperations();
}

class Addition extends BasicMathematicalOperations{
    void mathematicalOperations(){
        int a = 10, b = 15;
        int addition= a+b;
        System.out.println("Addition: "+ addition);
    }
}

class Substraction extends BasicMathematicalOperations{
    void mathematicalOperations(){
        int a = 550, b = 100;
        int sub = a-b;
        System.out.println("Substraction: "+ sub);
    }
}

class Multiplication extends BasicMathematicalOperations{
    void mathematicalOperations(){
        int a = 10, b = 5;
        int mul = a * b;
        System.out.println("Multiplication: "+ mul);
    }
}

class Division extends BasicMathematicalOperations{
    void mathematicalOperations(){
        int a = 100, b = 10;
        int div = a/b;
        System.out.println("Division: "+ div);
    }
}

class Modulus extends BasicMathematicalOperations{
    void mathematicalOperations(){
        int a =374, b = 243;
        double mod = a%b;
        System.out.println("Modulus: "+ mod);
    }
}

public class PolymorphismAssignment4 {
    public static void main(String[] args) {

        BasicMathematicalOperations basicMathematicalOperations;
        System.out.println("Basic Mathematical Operations: ");

        basicMathematicalOperations = new Addition();
        basicMathematicalOperations.mathematicalOperations();

        basicMathematicalOperations = new Substraction();
        basicMathematicalOperations.mathematicalOperations();

        basicMathematicalOperations = new Multiplication();
        basicMathematicalOperations.mathematicalOperations();

        basicMathematicalOperations = new Division();
        basicMathematicalOperations.mathematicalOperations();

        basicMathematicalOperations = new Modulus();
        basicMathematicalOperations.mathematicalOperations();
    }
}
