package com.gentech.methods.withreturn.assignment;

class SecondHalfShortElements {
    short[] secondHalfElements(short[] x) {
        int halfLength = x.length / 2;
        short[] secondHalf = new short[x.length - halfLength];

        for (int i = 0; i < secondHalf.length; i++) {
            secondHalf[i] = x[halfLength + i];
        }
        return secondHalf;
    }
}

public class MainSecondHalfShortElements {
    public static void main(String[] args) {
        SecondHalfShortElements obj = new SecondHalfShortElements();
        short[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9,10};
        short[] secondHalfArr = obj.secondHalfElements(arr);

        for (short element : secondHalfArr) {
            System.out.print(element + " ");
        }
    }
}
