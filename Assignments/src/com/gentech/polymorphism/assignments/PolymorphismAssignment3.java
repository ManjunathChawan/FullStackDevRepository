package com.gentech.polymorphism.assignments;

abstract class OopsConcepts{
    abstract void concepts();
}

class Class extends OopsConcepts{
    void concepts(){

    }
}

class Object extends OopsConcepts{
    void concepts(){
        System.out.println("Object");
    }
}

class Polymorphism extends OopsConcepts{
    void concepts(){
        System.out.println("Polymorphism");

    }
}

class Inheritance extends OopsConcepts{
    void concepts(){
        System.out.println("Inheritance");

    }
}

class Encapsuation extends OopsConcepts{
    void concepts(){
        System.out.println("Encapsuation");
    }
}

class Abstraction extends OopsConcepts{
    void concepts(){
        System.out.println("Abstraction");
    }
}
public class PolymorphismAssignment3 {
    public static void main(String[] args) {
        OopsConcepts oopsConcepts;

        System.out.println("OOPS Concepts in Java: ");
        oopsConcepts = new Class();
        oopsConcepts.concepts();

        oopsConcepts = new Object();
        oopsConcepts.concepts();

        oopsConcepts = new Inheritance();
        oopsConcepts.concepts();

        oopsConcepts = new Polymorphism();
        oopsConcepts.concepts();

        oopsConcepts = new Encapsuation();
        oopsConcepts.concepts();

        oopsConcepts = new Abstraction();
        oopsConcepts.concepts();
    }
}
