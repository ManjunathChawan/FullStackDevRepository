//Write a program in which outer class contains two inner static classes execute all the class memebers

package com.gentech.OuterInnerClass.Assignment;

class Person
{
    int age;
    int phone;
    static class PersonDetalis
    {
        String PersonName;
        String job;
        int  PersonId;

    }
    static class PersonAddress
    {
        String country;
        String state;
        String city;
        int pincode;

    }
    void displayPerson()
    {
        int age=23;
        int phone=56124954;
        System.out.println("Age:"+age);
        System.out.println("Phone:"+phone);

    }
    void displayCustomerDetalis()
    {
        String PersonName="Manjunath";
        String job="Accountant";
        int  PersonId=27834;
        System.out.println("Person Name:"+PersonName);
        System.out.println("Person Job:"+job);
        System.out.println("Person Id:"+PersonId);

    }
    void displayPersonAddress()
    {
        String country="India";
        String state="Karnataka";
        String city="Yadgir";
        int pincode=585215;
        System.out.println("Country:"+country);
        System.out.println("State:"+state);
        System.out.println("City:"+city);
        System.out.println("Pincode:"+pincode);

    }
}

public class OuterInnerAssignment4 {
    public static void main(String args[]) {
        Person o=new Person();
        o.displayCustomerDetalis();
        o.displayPersonAddress();
        o.displayPerson();
    }
}
