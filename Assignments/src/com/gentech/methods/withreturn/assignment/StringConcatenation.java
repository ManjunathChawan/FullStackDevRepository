package com.gentech.methods.withreturn.assignment;

class StringConcatenator {
    String concatenateElements(String[] array) {
        String concatenatedString = "";

        for (String element : array) {
            concatenatedString += element;
        }
        return concatenatedString;
    }
}

public class StringConcatenation {
    public static void main(String[] args) {
        StringConcatenator concatenator = new StringConcatenator();
        String[] array = {"Hello", " ", "Manjunath", "!", " How", " are", " you", "?"};
        String result = concatenator.concatenateElements(array);
        System.out.println("Concatenated String: " + result);
    }
}