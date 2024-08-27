//Write a nested class in which the inner class is private and execute outer and inner class data members.
package com.gentech.OuterInnerClass.Assignment;
class Employee
{
    String firstName;
    String lastName;
    String job;
    EmployeeDetails o=new EmployeeDetails();
    private class EmployeeDetails
    {
        int age;
        int phoneNo;

    }
    void DisplayOutter()
    {
        firstName="Manjunath";
        System.out.println("Name   :"+firstName);
        lastName="Chawan";
        System.out.println("Last Name   :"+lastName);
        job="Software Engineer";
        System.out.println("Job    :"+job);
    }
    public void DisplayInner() {
        o.age=23;
        System.out.println("Age    :"+o.age);
        o.phoneNo=1234567890;
        System.out.println("PhoneNO:"+o.phoneNo);
    }
}
public class OuterInnerAssignment1 {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.DisplayOutter();
        obj.DisplayInner();
    }
}

