package com.gentech.inheritance.specialcase;

class AA{
    AA(){
        System.out.println("This is AA class Constructor");
    }
}

class BB extends AA{
    BB(){
        System.out.println("This is BB class Constructor");
    }

}

class CC extends BB{
    CC(){
        System.out.println("This is CC class Constructor");
    }
}

public class ExecutionOrderOfMultilevelInheritance {
    public static void main(String[] args) {
        CC obj = new CC();
    }
}
