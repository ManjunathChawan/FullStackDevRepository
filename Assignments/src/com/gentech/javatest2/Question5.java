package com.gentech.javatest2;

class Voting{
    static String eligibleVoting(){
        int age = 17;
        String res="";
        if(age>=18)
            return "Eligible for voting";
        else
            return "Not Eligible for voting";
    }
}
public class Question5 {
    public static void main(String[] args) {
        String res=Voting.eligibleVoting();
        System.out.println(res);
    }
}
