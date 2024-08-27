package com.gentech.constructor.noargs;

class Student {
    int studentId;
    String name;
    int age;
    String course;

    Student(){
        studentId=1;
        name = "Manjunath";
        studentId = 1;
        age = 23;
        course="CSE";


        System.out.println("----------Students----------");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student course: " + course);
        System.out.println("--------------------------------------");
    }
}

class Library {
    String libraryName;
    int booksCount;
    String librarian;

    Library(){
        libraryName="SDMCET";
        booksCount=1000;
        librarian="Kiran";

        System.out.println("----------Library----------");
        System.out.println("Library name: " + libraryName);
        System.out.println("Books count: " + booksCount);
        System.out.println("Librarian: " + librarian);
        System.out.println("--------------------------------------");

    }
}

class Sports {
    String sportsName;
    int equipmentCount;
    String coach;

    Sports(){
        coach="Veeresh";
        sportsName="Cricket";
        equipmentCount=5;

        System.out.println("----------Sports----------");
        System.out.println("Sports name: " + sportsName);
        System.out.println("Equipment count: " + equipmentCount);
        System.out.println("Coach: " + coach);
        System.out.println("--------------------------------------");
    }
}
class ComputerLab {
    String labName;
    int computersCount;
    String technician;

    ComputerLab(){
        computersCount = 100;
        labName="CSE";
        technician="ADdf";

        System.out.println("----------Computer Lab----------");
        System.out.println("Lab name: " + labName);
        System.out.println("Computers count: " + computersCount);
        System.out.println("Technician: " + technician);
        System.out.println("--------------------------------------");
    }
}

public class StudentDetails {
    public static void main(String[] args){
        Student student=new Student();
        Library library=new Library();
        Sports sports=new Sports();
        ComputerLab computerLab=new ComputerLab();
    }
}
