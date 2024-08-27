package com.gentech.inheritance.specialcases.assignments;

class Employee2 {
    String ename;
    int emp_id;

    Employee2() {
        System.out.println("This is an Employee constructor");
    }

    Employee2(String ename, int emp_id) {
        this.ename = ename;
        this.emp_id = emp_id;
        System.out.println("Employee name is : " + this.ename);
        System.out.println("Employee id is : " + this.emp_id);
    }
}

class Department2 extends Employee2 {
    String deptName;
    int dept_id;

    Department2() {
        super();
        System.out.println("--------------------------------------------");
        System.out.println("This is a Department constructor");
    }

    Department2(String ename, int emp_id, String deptName, int dept_id) {
        super(ename, emp_id);
        System.out.println("---------------------------------------------");
        this.deptName = deptName;
        this.dept_id = dept_id;
        System.out.println("Department name is : " + this.deptName);
        System.out.println("Department id is : " + this.dept_id);
    }
}

class Project extends Department2 {
    String pName;
    int p_id;

    Project() {
        super();
        System.out.println("--------------------------------------------");
        System.out.println("This is Project Constructor");
    }

    Project(String ename, int emp_id, String deptName, int dept_id, String pName, int p_id) {
        super(ename, emp_id, deptName, dept_id);
        System.out.println("---------------------------------------------");
        this.pName = pName;
        this.p_id = p_id;
        System.out.println("Project name is : " + this.pName);
        System.out.println("Project id is : " + this.p_id);
    }
}

public class MultiLevelInheritanceDemo5 {
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("Manjunath", 1234, "Developer", 100, "Web development", 200);
    }
}
