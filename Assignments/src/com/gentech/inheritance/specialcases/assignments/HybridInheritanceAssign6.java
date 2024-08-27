package com.gentech.inheritance.specialcases.assignments;

//In Hybrid Inheritance super class Contains Parameterized Constructor, Based on sub class objects
//Execute Super class Parameterized Constructor


class Employee1 {
    Employee1(String ename,String jobname) {
        System.out.println("Employee Name : " + ename);
        System.out.println("Job Name is : " + jobname);
    }
}
class Department1 extends Employee1 {
    Department1(String Dname,int Deprtment_id) {
        super("Manjunath","Assistant Manager");
        System.out.println("Department Name : " + Dname);
        System.out.println("Department ID : " + Deprtment_id);
    }
}
class Employeecity1 extends Department1 {
    String Employeecity1;
    Employeecity1 (String CityName,String State) {
        super("Accounts",30);
        Employeecity1 = "Bengaluru";
        System.out.println("Employee City Name : " + Employeecity1);
    }
}
class DepBranch1 extends Employeecity1 {
    String DepBranch1;
    DepBranch1 () {
        super("Yadgir","Karnataka");
        DepBranch1 = "Bengaluru";
        System.out.println("Department Branch : " + DepBranch1);
    }
}

public class HybridInheritanceAssign6 {
    public static void main (String [] args) {
        DepBranch1 O1 = new DepBranch1();
    }
}
