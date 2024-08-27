/*if super class and subclass contains same variables with same data type,
in this case subclass variable hides super class variables*/

package com.gentech.inheritance.specialcase;
class Student{
    String bookName;
    void show(){
        System.out.println("Book name in Student class:" + bookName);
    }
}
class Library extends Student{
    String bookName;
    Library(String name){
        super.bookName= name;
    }
    void display(){
        System.out.println("Book name in Library class: "+ bookName);
    }
}
public class InheritanceDemo4 {
    public static void main(String[] args) {
        Library obj = new Library("SQL");
        obj.bookName="Java Reference";
        obj.show();
        obj.display();
    }
}
