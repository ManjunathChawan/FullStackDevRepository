package com.gentech.javatest2;
class AverageValue{
    public static double calculateAverage(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        return average;
    }
}
public class Question13 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        double average = AverageValue.calculateAverage(num1, num2, num3);
        System.out.println("The average value is: " + average);
    }


}
