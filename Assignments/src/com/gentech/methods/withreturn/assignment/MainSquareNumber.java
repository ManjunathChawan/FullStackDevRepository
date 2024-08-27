package com.gentech.methods.withreturn.assignment;

class SquareNumber{
    int calculateSquare(int num){
        return num*num;
    }
}

public class MainSquareNumber {
    public static void main(String[] args){
        SquareNumber obj = new SquareNumber();
        System.out.println("Square of numbers between 1 to 10: ");
        for (int i =1; i<=10; i++){
            int square = obj.calculateSquare(i);
            System.out.println("Square of number "+ i+ " is "+ square);
        }
    }
}
