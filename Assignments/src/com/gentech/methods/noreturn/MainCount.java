package com.gentech.methods.noreturn;

class Count{
    void count(){
        int count = 0;
        for (int i = 50; i <= 150; i++) {
            if (i % 6 == 0) {
                count++;
            }
        }
        System.out.println("Number of integers divisible by 6 between 50 and 150 is: " + count);
    }
}

public class MainCount {
    public static void main(String[] args){
        Count o=new Count();
        o.count();
    }
}
