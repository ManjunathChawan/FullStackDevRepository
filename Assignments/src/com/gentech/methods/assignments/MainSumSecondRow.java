package com.gentech.methods.assignments;

class SumSecondRow {
    double[][] array = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6},
            {7.7, 8.8, 9.9}
    };

    void sumSecondRow() {
        double sum = 0;
        for (int j = 0; j < array[1].length; j++) {
            sum += array[1][j];
        }
        System.out.println("Sum of the elements in the second row is: " + sum);
    }
}

public class MainSumSecondRow {
    public static void main(String[] args) {
        SumSecondRow sr = new SumSecondRow();
        sr.sumSecondRow();
    }
}
