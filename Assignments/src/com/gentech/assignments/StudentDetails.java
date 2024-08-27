package com.gentech.assignments;

class Student {
    int studentId;
    String name;
    int age;
    String course;
}

class Library {
    String libraryName;
    int booksCount;
    String librarian;
}

class Sports {
    String sportsName;
    int equipmentCount;
    String coach;
}
class ComputerLab {
    String labName;
    int computersCount;
    String technician;
}


public class StudentDetails {
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Manjunath";
        student.studentId = 1;
        student.age = 23;
        student.course="CSE";

        System.out.println("----------Students----------");
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Student name: " + student.name);
        System.out.println("Student age: " + student.age);
        System.out.println("Student course: " + student.course);
        System.out.println("--------------------------------------");

        Library library =new Library();
        library.libraryName="SDMCET";
        library.booksCount=1000;
        library.librarian="Kiran";

        System.out.println("----------Library----------");
        System.out.println("Library name: " + library.libraryName);
        System.out.println("Books count: " + library.booksCount);
        System.out.println("Librarian: " + library.librarian);
        System.out.println("--------------------------------------");

        Sports sports = new Sports();
        sports.coach="Veeresh";
        sports.sportsName="Cricket";
        sports.equipmentCount=5;

        System.out.println("----------Sports----------");
        System.out.println("Sports name: " + sports.sportsName);
        System.out.println("Equipment count: " + sports.equipmentCount);
        System.out.println("Coach: " + sports.coach);
        System.out.println("--------------------------------------");

        ComputerLab computerLab = new ComputerLab();
        computerLab.computersCount = 100;
        computerLab.labName="CSE";
        computerLab.technician="ADdf";

        System.out.println("----------Computer Lab----------");
        System.out.println("Lab name: " + computerLab.labName);
        System.out.println("Computers count: " + computerLab.computersCount);
        System.out.println("Technician: " + computerLab.technician);
        System.out.println("--------------------------------------");

    }
}
