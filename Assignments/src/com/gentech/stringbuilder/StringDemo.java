package com.gentech.stringbuilder;

public class StringDemo {
    public static void main(String[] args) {
        getCharCount();
        validateString();
        getCharBasedOnPostion();
        toUpperCase();
        toLowerCase();
    }

    static void getCharCount(){
        String s = new String("Welcome");
        int v1 = s.length();
        System.out.println("Length of String: "+ v1);
        System.out.println("--------------------------");
    }

    static void validateString(){
        String s = new String("Hello");
        boolean v1 = s.isEmpty();
        System.out.println("Is String empty? "+ v1);
        System.out.println("-----------------------");

    }

    static void getCharBasedOnPostion(){
        String s =new String("Welcome to the world");
        char ch = s.charAt(11);
        System.out.println("Character at position: "+ ch);
        System.out.println("---------------------------");
    }

    static void toUpperCase(){
        String s =new String("Hello Everyone!");
        String s1 = s.toUpperCase();
        System.out.println("String in uppercase: "+ s1);
        System.out.println("-----------------------------");
    }

    static void toLowerCase(){
        String s =new String("Hello Everyone!");
        String s1 = s.toLowerCase();
        System.out.println("String in lowercase: "+ s1);
        System.out.println("-----------------------------");
    }
}
