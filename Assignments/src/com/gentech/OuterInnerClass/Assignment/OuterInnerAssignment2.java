//Write a program for nested class in which inner class is static execute the members of outer clss and inner class.

package com.gentech.OuterInnerClass.Assignment;

class Outer2{
    int age;
    int phoneNo;
    void displayOutter()
    {
        age=23;
        phoneNo=134567890;
        System.out.println("Age:"+age);
        System.out.println("phone Number:"+phoneNo);
    }
    static class StudentDetails
    {
        String  stdName;
        String  standerd;
        String gender;

    }
    void displaystatic()
    {
        String stdName = "Manjunath";
        String gender="Male";
        System.out.println("Student Name:"+stdName);
        System.out.println("Gender :"+gender);

    }

}

public class OuterInnerAssignment2 {

    public static void main(String[] args) {
        Outer2 o=new Outer2();
        o.displaystatic();
        o.displayOutter();

    }
}
