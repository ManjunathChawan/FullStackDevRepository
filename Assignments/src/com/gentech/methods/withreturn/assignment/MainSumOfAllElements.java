package com.gentech.methods.withreturn.assignment;

class SumOfElements{
    int sumOfElements(int x[]){
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
}

public class MainSumOfAllElements {
    public static void main(String[] args){
        SumOfElements obj = new SumOfElements();
        int[] arr = {1,2,3,4,5,6,7,8};
        int sumValue= obj.sumOfElements(arr);
        System.out.print("Sum of all the Elements: "+ sumValue);

    }
}
