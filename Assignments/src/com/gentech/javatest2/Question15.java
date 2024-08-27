package com.gentech.javatest2;
class DivisibleBy4{
    public static int countDivisibleByFour(int start, int end) {
        int count = 0;
        for (int i = start; i >= end; i--) {
            if (i % 4 == 0) {
                count++;
            }
        }
        return count;
    }
}
public class Question15 {
    public static void main(String[] args) {
        int count = DivisibleBy4.countDivisibleByFour(50, 30);
        System.out.println("The count of numbers between 50 and 30 divisible by 4 is: " + count);
    }


}

