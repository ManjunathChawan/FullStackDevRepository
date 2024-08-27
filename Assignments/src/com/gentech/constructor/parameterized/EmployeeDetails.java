package com.gentech.constructor.parameterized;

class Employee {
    int empId;
    String firstName;
    String lastName;
    String role;
    String emailId;
    String phoneNo;
    String gender;
    String address;

    Employee(int empId, String fn, String ln, String role,
             String emailId, String phoneNo, String gender,
             String address){
        firstName=fn;
        lastName=ln;
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

    Department(int depId, String depName, String companyName, String location, int noOfEmployees){
        System.out.println("-------Department details-------");
        System.out.println("Derpartment Id: "+ depId);
        System.out.println("Derpartment name: "+ depName);
        System.out.println("Company name: "+ companyName);
        System.out.println("Company location: "+ location);
        System.out.println("No of Employees: "+noOfEmployees);
        System.out.println("-----------------------------------");
    }
}

class Insurance {
    int insuranceId;
    String name;
    String emailId;
    String phoneNo;
    String insuranceComapany;
    double amount;

    Insurance(int insuranceId, String name, String emailId, String phoneNo, String insuranceComapany, double amount){
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
        Employee employee=new Employee(1,"Manjunath","Chawan","Developer",
                "Chawan@gmail.com","13245678","male",
                "Attiguppe");
        Employee employee1=new Employee(2,"Manjunath","Chawan","Developer",
                "Chawan@gmail.com","13245678","male",
                "Attiguppe");

        Department department=new Department(1,"IT","Google",
                "Bengaluru", 100);
        Department department1=new Department(2,"Non-IT","Google",
                "Bengaluru", 1000);

        Insurance insurance = new Insurance(1,"Manjunath","chawan2gmail.com",
                "1234567","LIC", 1234.0);

        Insurance insurance1 = new Insurance(2,"Kiran","chawan2gmail.com",
                "1234567","LIC", 1234.0);




    }
}
