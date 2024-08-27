package com.gentech.javatest2;

class OddNumbers{
    public static int[] getOddNumbers() {
        int[] oddNumbers = new int[6];
        int index = 0;
        for (int i = 21; i >= 11; i--) {
            if (i % 2 != 0) {
                oddNumbers[index++] = i;
            }
        }
        return oddNumbers;
    }
}
public class Question9 {
    public static void main(String[] args) {
        int[] oddNumbers = OddNumbers.getOddNumbers();
        System.out.print("Odd numbers from 21 to 11: ");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
    }


}
