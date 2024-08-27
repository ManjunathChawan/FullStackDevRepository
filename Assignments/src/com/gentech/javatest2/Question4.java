package com.gentech.javatest2;

class Rectangle{
    static int length=5;
    static int breadth=15;
    static int area(){
        return length*breadth;
    }
}
public class Question4 {
    public static void main(String[] args) {
        int res=Rectangle.area();
        System.out.println(res);
    }
}
