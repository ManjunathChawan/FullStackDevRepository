package com.gentech.methods.assignments;

class PrimeNumberCounter {
    void countPrimes() {
        int count = 0;
        for (int i = 50; i <= 150; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println("Number of prime numbers between 50 and 150 is: " + count);
    }
}

public class MainPrimeNumberCount {
    public static void main(String[] args) {
        PrimeNumberCounter pnc = new PrimeNumberCounter();
        pnc.countPrimes();
    }
}
