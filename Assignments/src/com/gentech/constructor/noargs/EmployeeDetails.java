package com.gentech.constructor.noargs;

class Employee{
    int empId;
    String firstName;
    String lastName;
    String role;
    String emailId;
    String phoneNo;
    String gender;
    String address;

    Employee(){
        empId = 1;
        firstName = "Manjunath";
        lastName="Chawan";
        role="Developer";
        emailId="chawanmanjunath@gmail.com";
        phoneNo="8747884862";
        gender="Male";
        address="Chandr layout, Benglauru 560040";
        System.out.println("-------Employee Details-------");
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee First name: "+firstName);
        System.out.println("Employee Last name: "+lastName);
        System.out.println("Employee Role: "+role);
        System.out.println("Employee Email Id: "+emailId);
        System.out.println("Employee phone number: "+phoneNo);
        System.out.println("Employee gender: "+gender);
        System.out.println("Employee address: "+address);
        System.out.println("--------------------------------");

    }

}

class Department{
    int depId;
    String depName;
    String companyName;
    String location;
    int noOfEmployees;

    Department(){
        depId=1;
        depName="IT";
        companyName="Gentech";
        location="Attigupe";
        noOfEmployees=100;

        System.out.println("-------Department details-------");
        System.out.println("Derpartment Id: "+ depId);
        System.out.println("Derpartment name: "+ depName);
        System.out.println("Company name: "+ companyName);
        System.out.println("Company location: "+ location);
        System.out.println("No of Employees: "+noOfEmployees);
        System.out.println("-----------------------------------");

    }

}

class Insurance{
    int insuranceId;
    String name;
    String emailId;
    String phoneNo;
    String insuranceComapany;
    double amount;

    Insurance(){
        insuranceId=123;
        name="Manjunath";
        emailId="xyz@gmail.com";
        phoneNo="1234567890";
        insuranceComapany="policy bazar";
        amount=134567.0;

        System.out.println("------Insurance Details------");
        System.out.println("Insurance Id: "+insuranceId);
        System.out.println("Insurance holder name: "+name);
        System.out.println("Insurance holder email: "+emailId);
        System.out.println("Insurance holder phone No: "+phoneNo);
        System.out.println("Insurance provider comapany name: "+insuranceComapany);
        System.out.println("Insurance amount: "+amount);
        System.out.println("-------------------------------------");
    }
}

public class EmployeeDetails {
    public static void main(String[] args){
        Employee employee=new Employee();
        Department department=new Department();
        Insurance insurance=new Insurance();
    }
}
