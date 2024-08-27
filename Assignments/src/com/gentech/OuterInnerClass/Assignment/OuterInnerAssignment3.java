//Write a program in which the order class contains twoo inner private class execute members of all the class

package com.gentech.OuterInnerClass.Assignment;

class Customer
{
    int age;
    int phone;
    private class CustomerDetalis
    {
        String custName;
        String job;
        int  custId;

    }
    private class CustomerAddress
    {
        String country;
        String state;
        String city;
        int pincode;
    }
    void displayCustomer()
    {
        int age=23;
        int phone=70089849;
        System.out.println("Age:"+age);
        System.out.println("Phone:"+phone);
    }
    void displayCustomerDetalis()
    {
        String custName="Santosh";
        String job="Data Analyst";
        int  custId=721384;
        System.out.println("Customer Name:"+custName);
        System.out.println("Customer Job:"+job);
        System.out.println("Customer Id:"+custId);

    }
    void displayCustomerAddress()
    {
        String country="India";
        String state="Karnataka";
        String city="Bangalore";
        int pincode=560040;
        System.out.println("Country:"+country);
        System.out.println("State:"+state);
        System.out.println("City:"+city);
        System.out.println("Pincode:"+pincode);

    }
}

public class OuterInnerAssignment3 {
    public static void main(String args[]) {
        Customer o=new Customer();
        o.displayCustomerDetalis();
        o.displayCustomer();
        o.displayCustomerAddress();
    }
}
