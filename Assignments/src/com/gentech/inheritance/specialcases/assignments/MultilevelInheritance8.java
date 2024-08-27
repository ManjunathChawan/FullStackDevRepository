package com.gentech.inheritance.specialcases.assignments;


class Emp{
    String ename="Manjunath";
    int emp_id=45;
}
class Dept extends Emp{
    String dname="Development";
    int dept_no=57;
}
class Proj extends Dept{
    String pname="App development";
    int pid=300;
    void empDetails(){
        System.out.println("Employee name is : "+ename);
        System.out.println("Employee id is : "+emp_id);
        System.out.println("-------------------------------------");
    }
    void deptDetails(){
        System.out.println("Department name is : "+dname);
        System.out.println("Department number is : "+dept_no);
        System.out.println("-------------------------------------");
    }
    void projectDetails(){
        System.out.println("Project name is : "+pname);
        System.out.println("Project id is : "+pid);
    }
}
public class MultilevelInheritance8 {
    public static void main(String[] args) {
        Proj p = new Proj();
        p.empDetails();
        p.deptDetails();
        p.projectDetails();
    }
}