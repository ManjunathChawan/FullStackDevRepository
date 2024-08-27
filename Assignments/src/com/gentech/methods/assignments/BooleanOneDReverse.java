package com.gentech.methods.assignments;

class BooleanReverse{
    boolean arr[]={true,false};
    void reverseArray(){
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}

public class BooleanOneDReverse {
    public static void main(String[] args){
        BooleanReverse obj = new BooleanReverse();
        obj.reverseArray();
    }
}
