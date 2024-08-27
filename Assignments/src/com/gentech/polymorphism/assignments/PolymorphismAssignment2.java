package com.gentech.polymorphism.assignments;

abstract class Departments{
    abstract void dept();
}

class CSE extends Departments{
    void dept(){
        System.out.println("Department of Computer Sceince and Engineering");
    }
}

class ISE extends Departments{
    void dept(){
        System.out.println("Department of Information Sceince and Engineering");
    }
}

class AIML extends Departments{
    void dept(){
        System.out.println("Department of Artificial and Intelligence in MAchine Learning");
    }
}

class Civil extends Departments{
    void dept(){
        System.out.println("Department of Civil Engineering");
    }
}

public class PolymorphismAssignment2 {
    public static void main(String[] args) {
        Departments departments;

        System.out.println("Departments availaable in college:");

        departments = new CSE();
        departments.dept();

        departments = new ISE();
        departments.dept();

        departments = new AIML();
        departments.dept();

        departments = new Civil();
        departments.dept();
    }
}
