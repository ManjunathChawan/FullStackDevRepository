package com.gentech.methods.assignments;

class OneDimension{
    String[] sampleArray = {"apple", "banana", "cherry", "date", "elderberry", "grapes"};
    void displaySeconHalf(){
        for (int i = sampleArray.length/2 ; i <= sampleArray.length-1; i++) {
            System.out.print(sampleArray[i] + " ");
        }
        System.out.println();
    }

}

public class OneDSecondHalf {
    public static void main(String[] args){
        OneDimension o = new OneDimension();
        o.displaySeconHalf();
    }
}
