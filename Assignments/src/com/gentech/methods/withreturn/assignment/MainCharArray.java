package com.gentech.methods.withreturn.assignment;

class CharArray{
    char[] getFirstRow(char[][] array){
        if(array.length>0){
            return array[0];
        }else {
            return new char[0];
        }
    }
}

public class MainCharArray {
    public static void main(String[] args){
        CharArray charArray = new CharArray();

        char[][] array ={
                {'a','b','c'},
                {'d','e','f'},
                {'h','i','j'}
        };

        char[] firstRow = charArray.getFirstRow(array);
        System.out.println("First row: ");
        for (char ch: firstRow){
            System.out.print(ch+ " ");
        }
        System.out.println();
    }
}
