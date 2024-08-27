package com.gentech.inheritance.specialcases.assignments;

//In Multilevel Superclass Contains Parameterized Constructor based on object Execute Super Class Parameterized Constructor

class Employee {
    Employee(String ename,String jobname) {
        System.out.println("Employee Name : " + ename);
        System.out.println("Job Name is : " + jobname);
    }
}
class Department extends Employee {
    Department(String Dname,int Deprtment_id) {
        super("Manjunath","Manager");
        System.out.println("Department Name : " + Dname);
        System.out.println("Department ID : " + Deprtment_id);
    }
}
class Employeecity extends Department {
    String Employeecity;
    Employeecity () {
        super("IT",12);
        Employeecity = "Bengaluru";
        System.out.println("Employee City Name : " + Employeecity);
    }
}
public class MultilevelInheritanceAssign4 {
    public static void main (String [] args) {
        Employeecity O1 = new Employeecity();
    }
}

