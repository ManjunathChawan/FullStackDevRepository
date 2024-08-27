package com.gentech.methods.assignments;

class MultiplicationTables {
    void displayTables() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}

public class MainMultiplicationTables {
    public static void main(String[] args) {
        MultiplicationTables obj = new MultiplicationTables();
        obj.displayTables();
    }
}
