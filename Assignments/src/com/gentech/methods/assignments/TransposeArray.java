package com.gentech.methods.assignments;

class TransposedArray {
    int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    void transposeAndDisplay() {
        int[][] transposedArray = new int[3][3];
        // Transposing the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }


        for (int i = 0; i < transposedArray.length; i++) {
            for (int j = 0; j < transposedArray[i].length; j++) {
                System.out.print(transposedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class TransposeArray {
    public static void main(String[] args) {
        TransposedArray ta = new TransposedArray();
        //System.out.println("Transposed array:");
        ta.transposeAndDisplay();
    }
}
