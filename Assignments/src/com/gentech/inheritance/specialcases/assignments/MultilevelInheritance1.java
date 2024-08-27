package com.gentech.inheritance.specialcases.assignments;

class College{
    void collegeName(String name, String address){
        System.out.println("College name: "+ name+ ", "+ address);
    }
}

class Courses extends College{
    void coursesDetails(String courses[]){
        System.out.println("Courses available: ");
        for (int i = 0; i< courses.length; i++){
            System.out.println(courses[i]);
        }
    }
}
class Student extends Courses{
    void studentDetails(String stdname, String email){
        System.out.println("Student name: "+ stdname);
        System.out.println("Email: "+ email);
    }
}

public class MultilevelInheritance1 {
    public static void main(String[] args){
        Student student = new Student();
        student.collegeName("SDM Engineering and Technology", "Dharwad");
        student.coursesDetails(new String[]{"CSE", "EEE"});
        student.studentDetails("Manjunath", "chawanmanjunath@gmail.com");

    }
}
