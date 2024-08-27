package com.gentech.inheritance.specialcases.assignments;

class Random1 {
    void Subtract(int a,int b) {
        System.out.println("Subtract Result : " + (a-b));
    }
}
class Random2 extends Random1 {
    void Multiply(int a,int b) {
        System.out.println("Multiply Result : " + (a*b));
    }
}
class Random3 extends Random1 {
    void Division (int a, int b) {
        System.out.println("Division Result : " + (a/b));
    }
}
public class HirarchialInheritance {
    public static void main(String [] args) {
        Random2 obj1 = new Random2();
        obj1.Subtract(80,40);
        obj1.Multiply(10,4);
        obj1.Multiply(5,31);
        System.out.println("---------------------------------");
        Random3 obj2 = new Random3();
        obj2.Division(60,10);
        obj2.Subtract(60,20);
        obj2.Division(100,10);
    }
}
