package com.gentech.constructor.parameterized;


class Student {
    int studentId;
    String name;
    int age;
    String course;

    Student(int studentId, String name, int age, String course){

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

    Library(String libraryName, int booksCount, String librarian){
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

    Sports(String sportsName, int equipmentCount, String coach) {
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

    ComputerLab(String labName, int computersCount, String technician) {
        System.out.println("----------Computer Lab----------");
        System.out.println("Lab name: " + labName);
        System.out.println("Computers count: " + computersCount);
        System.out.println("Technician: " + technician);
        System.out.println("--------------------------------------");

    }
}
public class StudentDetails {
    public static void main(String[] args){
        Student student=new Student(1,"Manjunath", 23,"CSE");
        Student student1=new Student(2,"Kiran", 23,"civil");

        Library library=new Library("Shree", 100, "Ravi");
        Library library1 = new Library("Venkateshwara", 123, "Abhi");

        Sports sports=new Sports("Cricket", 2, "Rohit");
        Sports sports1=new Sports("Hockey", 3, "David");

        ComputerLab computerLab = new ComputerLab("DSA", 20, "Bharat");
        ComputerLab computerLab1=new ComputerLab("DE", 50, "Ganesh");


    }
}
