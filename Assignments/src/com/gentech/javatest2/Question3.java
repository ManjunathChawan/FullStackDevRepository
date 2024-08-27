package com.gentech.javatest2;

class AreaOfCircle{
    static int radius=5;
    static double area(){
        int radiusSquare=radius*radius;
        double pi=3.14;
        double area = pi*radiusSquare;
        return area;
    }
}
public class Question3 {
    public static void main(String[] args) {
        double res = AreaOfCircle.area();
        System.out.println(res);
    }
}
