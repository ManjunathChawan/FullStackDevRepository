package com.gentech.methods.withreturn.assignment;

class FirstHalfElements{
    int firstHalfElements(int x[]) {

        for (int i = 0; i < x.length / 2; i++) {
            System.out.print(x[i] + " ");
        }

        return x[x.length - 1];
    }
}

public class MainFirstHalf {
    public static void main(String[] args){
        FirstHalfElements obj = new FirstHalfElements();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int returnedValue = obj.firstHalfElements(arr);
    }
}
