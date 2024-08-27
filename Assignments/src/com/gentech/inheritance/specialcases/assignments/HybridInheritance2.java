package com.gentech.inheritance.specialcases.assignments;


class Departments{
    void deptDetails(String deptName, String deptHead, int noOfSubjects){
        System.out.println("Department name: "+ deptName);
        System.out.println("Deprtment head name: "+ deptHead);
        System.out.println("No fo subjects: "+ noOfSubjects);
    }
}

class CSE extends Departments{
    void cse(String deptHead, int noOfSubjects){
        System.out.println("Department head of CSE: "+ deptHead);
        System.out.println("No of Subjects in CSE: "+ noOfSubjects);
    }
}

class EEE extends Departments{
    void cse(String deptHead, int noOfSubjects){
        System.out.println("Department head of EEE: "+ deptHead);
        System.out.println("No of Subjects in EEE: "+ noOfSubjects);
    }
}

class Students extends CSE{
    void students(String name, String email){
        System.out.println("Student name: "+ name);
        System.out.println("Email: "+ email);
    }
}

public class HybridInheritance2 {
    public static void main(String[] args){
        EEE obj1 = new EEE();
        obj1.deptDetails("EEE", "Santosh", 12);
        System.out.println("-----------------------------");
        Students obj2 = new Students();
        obj2.students("Manjunath", "chawan@gmail.com");
        obj2.cse("Ganesh", 10);


    }
}
