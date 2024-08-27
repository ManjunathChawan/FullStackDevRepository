package com.gentech.methods.noreturn;

class Sum{
    void sum(){
        int res=1;
        for(int i = 0; i<=50; i++){
            res=res+i;
        }
        System.out.println("Addition of numbers between 0 to 50: "+ res);
    }
}

public class MainSum {
    public static void main(String[] args){
        Sum o= new Sum();
        o.sum();
    }
}
