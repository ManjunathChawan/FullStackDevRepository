package com.gentech.methods.withreturn.assignment;

class Factorial{
    long factorial(int num){
        long result = 1;
        for (int i = 1; i<=num; i++){
            result*=i;
        }
        return result;
    }
}
public class MainFactorial {
    public static void main(String[] args){
        Factorial obj = new Factorial();
        int num =10;
        long fact = obj.factorial(num);
        System.out.println("Factorial of "+ num + " is "+ fact);
    }
}
