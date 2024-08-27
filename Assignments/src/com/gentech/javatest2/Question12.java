package com.gentech.javatest2;
class LargestNumber{
    public static int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
public class Question12 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int largest = LargestNumber.findLargest(num1, num2);
        System.out.println("The largest number is: " + largest);
    }


}

