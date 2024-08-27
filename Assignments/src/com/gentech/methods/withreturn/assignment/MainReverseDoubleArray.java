package com.gentech.methods.withreturn.assignment;

class ReverseDoubleArray {
    double[] reverseDoubleArray(double x[]) {
        double[] reversedArray = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            reversedArray[i] = x[x.length - 1 - i];
        }
        return reversedArray;
    }
}

public class MainReverseDoubleArray {
    public static void main(String[] args){
    ReverseDoubleArray obj = new ReverseDoubleArray();
    double arr[] = {10.5, 34.0, 30.0, 40.5, 90.23};
    double[] reversedDoubleArray = obj.reverseDoubleArray(arr);

        System.out.print("Reversed Array: ");
        for (double num : reversedDoubleArray) {
        System.out.print(num + " ");
        }
        System.out.println();
    }
}
