package com.gentech.methods.assignments;

class PrimeNumbers {
    void displayPrimes() {
        System.out.println("Prime numbers between 1 and 50 are:");
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class MainPrimeNumber {
    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        pn.displayPrimes();
    }
}
