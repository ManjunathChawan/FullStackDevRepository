//If super class contains parameterized constructor ho to execute parmeterized super class

package com.gentech.inheritance.specialcase;

class Employee{
    Employee(String firstName, String lastName, String jobRole){
        System.out.println("First Name of Employee: "+ firstName);
        System.out.println("Last Name of Employee: "+ lastName);
        System.out.println("Job role: "+ jobRole);
    }
}

class Department extends Employee{
    String deptName;
    Department(){
        super("Manjunath", "Chawan", "Software Developer");
        deptName="IT";
        System.out.println("Department name: "+ deptName);
    }
}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        Department obj = new Department();

    }
}
