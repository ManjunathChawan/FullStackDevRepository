package com.gentech.methods.withreturn.assignment;

class DiagonalElements {
    short[] getDiagonalElements(short[][] array) {
        int dimension = array.length;
        short[] diagonalElements = new short[dimension];

        for (int i = 0; i < dimension; i++) {
            diagonalElements[i] = array[i][i];
        }

        return diagonalElements;
    }
}

public class MainDiagonalElements {
    public static void main(String[] args) {
        DiagonalElements diagonalElementsFinder = new DiagonalElements();

        short[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        short[] diagonalElements = diagonalElementsFinder.getDiagonalElements(array);

        System.out.print("Diagonal elements: ");
        for (short element : diagonalElements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
