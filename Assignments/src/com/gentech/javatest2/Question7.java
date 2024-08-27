package com.gentech.javatest2;

class SecondTable{
    int sumOfSecondTable(){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=2*i;
        }
        return sum;
    }
}
public class Question7 {
    public static void main(String[] args) {
        SecondTable obj = new SecondTable();
        int res=obj.sumOfSecondTable();
        System.out.println(res);
    }
}
