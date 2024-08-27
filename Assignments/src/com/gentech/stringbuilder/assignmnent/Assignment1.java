//without using length method, find the number of char in given string
package com.gentech.stringbuilder.assignmnent;

public class Assignment1 {
    public static void main(String[] args) {
        String str = "Hello, World";
        int count=0;
        for (char c: str.toCharArray()){
            count++;
        }
        System.out.println("No of char in given string: "+ count);
    }
}
