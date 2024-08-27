package com.gentech.inheritance.specialcase;

class Employee1{
    Employee1(String firstName, String lastName, String jname){
        System.out.println("Employee first name: "+ firstName);
        System.out.println("Employee last name: "+ lastName);
        System.out.println("Employee job role: "+ jname);
    }
}

class Department1 extends Employee1{
    String deptName;
    Department1(String name, String job, String dname){
        super("Manjunath", "Chawan", "Web Developer");
        deptName = dname;
    }
}
public class InheritanceDemo2 {
    public static void main(String[] args) {
        System.out.println("---------Employee Details--------");
        Employee1 obj = new Employee1("Manjunath", "Chawan", "Web Developer");
        System.out.println("---------Department Details------");
        Department1 obj1 = new Department1("Rohit", "Accountant", "Account");

    }
}
