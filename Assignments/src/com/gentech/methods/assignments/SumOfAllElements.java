package com.gentech.methods.assignments;

class SumElements{
    int arr[]={10,20,30,40,50,60};
    void displaySumElements(){
        int sum=0;
        for(int i=0; i< arr.length; i++){
           sum+=arr[i];
        }
        System.out.println("Sum of all the elements in the 1D array is: "+ sum);
    }

}

public class SumOfAllElements {
    public static void main(String[] args){
        SumElements o = new SumElements();
        o.displaySumElements();

    }
}
