package com.gentech.inheritance.specialcases.assignments;

class Calculus1 {
    void addition1(int a,int b) {
        System.out.println("Addition of 2 Digits : " + (a+b));
    }
}
class Calculus2 extends Calculus1 {
    void addition2(int a,int b,int c) {
        System.out.println("Addition of 3 Digits : " + (a+b+c));
    }
}
class Calculus3 extends Calculus2 {
    void addition3(int a,int b,int c,int d) {
        System.out.println("Addition of 4 Digits : " + (a+b+c+d));
    }
}

public class MultilevelInheritanceAssign7 {
    public static void main (String [] args) {
        Calculus3 O1 = new Calculus3();
        O1.addition1(20,30);
        O1.addition2(50,30,60);
        O1.addition3(70,80,90,100);
    }

}
