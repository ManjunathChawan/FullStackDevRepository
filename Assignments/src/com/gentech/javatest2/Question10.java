package com.gentech.javatest2;

class Factorial{
    int factorial(int num){
        int res=1;
        while(num!=1){
            res*=num;
            num--;
        }
        return res;
    }
}
public class Question10 {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int res=obj.factorial(4);
        System.out.println(res);
    }
}
