package com.gentech.javatest2;

class TwoDShort{
    public static int countElements(short[][] array) {
        int count = 0;
        for (short[] row : array) {
            count += row.length;
        }
        return count;
    }
}
public class Question14 {
    public static void main(String[] args) {
        short[][] array = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int elementCount = TwoDShort.countElements(array);
        System.out.println("The total number of elements in the 2D array is: " + elementCount);
    }


}
