package com.gentech.methods.withreturn.assignment;

class SevenTable{
    int getSevenTable(int base, int multiplier) {
        return base * multiplier;
    }
}

public class SevenTableReverse {
    public static void main(String[] args){
        SevenTable sevenTable = new SevenTable();
        int base = 7;
        System.out.println("7 table in reverse order: ");
        for (int i = 10; i >= 1; i--){
            int result = sevenTable.getSevenTable(base, i);
            System.out.println(base + " x "+ i + " = "+ result);
        }
    }
}
