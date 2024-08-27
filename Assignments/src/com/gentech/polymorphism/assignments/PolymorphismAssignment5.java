package com.gentech.polymorphism.assignments;

abstract class Vehicle{
    abstract void vehicleSpeed();
}

class Bike extends Vehicle{
    void vehicleSpeed(){
        System.out.println("Bike running at speed of 60kmph");
    }
}

class Car extends Vehicle{
    void vehicleSpeed(){
        System.out.println("Car running at speed of 100kmph");
    }
}

public class PolymorphismAssignment5 {
    public static void main(String[] args) {
        Vehicle vehicle;

        System.out.println("Vehicles Speed: ");
        vehicle = new Bike();
        vehicle.vehicleSpeed();

        vehicle = new Car();
        vehicle.vehicleSpeed();
    }
}
