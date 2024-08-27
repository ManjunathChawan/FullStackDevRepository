package com.gentech.inheritance.specialcase;

class Demo1{
    void displayCityName(String capitalCity){
        System.out.println("Capital City: "+ capitalCity);
    }
}

class Demo2 extends Demo1{
    Demo2(String name){
        super.displayCityName(name);
    }
    void displayCityName(String metroCity){
        System.out.println("Metro city name: "+metroCity);
    }
}
public class InheritanceDemo3 {
    public static void main(String[] args) {
        Demo2 obj = new Demo2("Bengaluru");
        obj.displayCityName("Hyderabad");
    }
}
