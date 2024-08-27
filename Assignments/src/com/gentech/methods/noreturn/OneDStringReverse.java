package com.gentech.methods.noreturn;

class ReverseOrder{
    String[] sampleArray = {"apple", "banana", "cherry", "date", "elderberry"};

    void displayReversedArray() {
        for (int i = sampleArray.length - 1; i >= 0; i--) {
            System.out.print(sampleArray[i] + " ");
        }
        System.out.println();
    }
}

public class OneDStringReverse {
    public static void main(String[] args){
        ReverseOrder o = new ReverseOrder();
        o.displayReversedArray();
    }
}
