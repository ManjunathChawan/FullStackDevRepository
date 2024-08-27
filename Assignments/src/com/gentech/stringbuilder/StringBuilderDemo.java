package com.gentech.stringbuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        appendString();
        insertString();
        deleteString();
        reverseString();
    }
    static void appendString(){
        StringBuilder s = new StringBuilder("Java");
        s.append(" Programing");
        System.out.println(s);
    }

    static void insertString(){
        StringBuilder s = new StringBuilder("It is a palace");
        s.insert(8, "new ");
        System.out.println(s);
    }

    static void deleteString(){
        StringBuilder s = new StringBuilder("It is a new palace");
        s.delete(8,12);
        System.out.println(s);
    }

    static void reverseString(){
        StringBuilder s = new StringBuilder("Welcome");
        s.reverse();
        System.out.println(s);
    }
}

