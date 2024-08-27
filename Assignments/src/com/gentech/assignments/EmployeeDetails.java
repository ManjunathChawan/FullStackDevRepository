package com.gentech.assignments;

class Employee{
    int empId;
    String firstName;
    String lastName;
    String role;
    String emailId;
    String phoneNo;
    String gender;
    String address;
}

class Department{
    int depId;
    String depName;
    String companyName;
    String location;

}

class Insurance{
    int insuranceId;
    String name;
    String emailId;
    String phoneNo;
    String insuranceComapany;
    double amount;
}

public class EmployeeDetails {

    public static void main(String[] args){
        Employee emp = new Employee();
        emp.empId=1;
        emp.firstName="Manjunath";
        emp.lastName="Chawan";
        emp.role = "Full Stack developer";
        emp.emailId="chawanmanjunath@gmail.com";
        emp.phoneNo="8747884862";
        emp.gender = "Male";
        emp.address= "Chandra Layout, Banglore 560040";
        System.out.println("-------Employee Details-------");
        System.out.println("Employee Id: "+emp.empId);
        System.out.println("Employee First name: "+emp.firstName);
        System.out.println("Employee Last name: "+emp.lastName);
        System.out.println("Employee Role: "+emp.role);
        System.out.println("Employee Email Id: "+emp.emailId);
        System.out.println("Employee phone number: "+emp.phoneNo);
        System.out.println("Employee gender: "+emp.gender);
        System.out.println("Employee address: "+emp.address);
        System.out.println("--------------------------------");

        Department dept = new Department();
        dept.depId=1;
        dept.depName = "Software development";
        dept.companyName="Amazon";
        dept.location= "Begaluru";
        System.out.println("-------Department details-------");
        System.out.println("Derpartment Id: "+ dept.depId);
        System.out.println("Derpartment name: "+ dept.depName);
        System.out.println("Company name: "+ dept.companyName);
        System.out.println("Company location: "+ dept.location);
        System.out.println("-----------------------------------");

        Insurance insurance = new Insurance();
        insurance.insuranceId=1;
        insurance.name = "Manjunath";
        insurance.emailId="chawanmanjunath@gmail.com";
        insurance.phoneNo="8747884862";
        insurance.insuranceComapany="LIC";
        insurance.amount=12334.0;
        System.out.println("------Insurance Details------");
        System.out.println("Insurance Id: "+insurance.insuranceId);
        System.out.println("Insurance holder name: "+insurance.name);
        System.out.println("Insurance holder email: "+insurance.emailId);
        System.out.println("Insurance holder phone No: "+insurance.phoneNo);
        System.out.println("Insurance provider comapany name: "+insurance.insuranceComapany);
        System.out.println("Insurance amount: "+insurance.amount);
        System.out.println("-------------------------------------");


    }
}


