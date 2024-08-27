package com.gentech.polymorphism.assignments;

abstract class ModeOfTransportation{
    abstract void travel();

}

class Aeroplane extends ModeOfTransportation{
    void travel(){
        System.out.println("Travel in Aeroplane");
    }
}

class Train extends ModeOfTransportation{
    void travel(){
        System.out.println("Travel in Train");
    }
}

class Bus extends ModeOfTransportation{
    void travel(){
        System.out.println("Travel in Bus");
    }
}

public class PolymorphismAssignment1 {
    public static void main(String[] args) {
        ModeOfTransportation transportation;
        System.out.println("Different modes of trasportation:");

        transportation = new Aeroplane();
        transportation.travel();

        transportation = new Train();
        transportation.travel();

        transportation =new Bus();
        transportation.travel();
    }
}
