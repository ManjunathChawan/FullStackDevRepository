package com.gentech.methods.assignments;

class PrimeNumberSum {
    void sumPrimes() {
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
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
                sum += i;
            }
        }
        System.out.println("Sum of prime numbers between 1 and 100 is: " + sum);
    }
}

public class MainPrimeNumberSum {
    public static void main(String[] args) {
        PrimeNumberSum pns = new PrimeNumberSum();
        pns.sumPrimes();
    }
}
