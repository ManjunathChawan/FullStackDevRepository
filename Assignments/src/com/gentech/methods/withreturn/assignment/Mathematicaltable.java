package com.gentech.methods.withreturn.assignment;

class Multiplicationable {
    String[] getMultiplicationTable(int num) {
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = num + " * " + (i + 1) + " = " + (num * (i + 1));
        }
        return arr;
    }
}

public class Mathematicaltable {
    public static void main(String[] args) {
        Multiplicationable table = new Multiplicationable();
        String[] b = table.getMultiplicationTable(7);
        for (String kk : b) {
            System.out.println(kk);
        }
    }
}