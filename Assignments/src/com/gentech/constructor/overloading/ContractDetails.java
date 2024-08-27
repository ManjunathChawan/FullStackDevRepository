package com.gentech.constructor.overloading;

class Contract{
    Contract(String cotractName){
        System.out.println("Contract name: "+ cotractName);
    }

    Contract(int durationInYears){
        this("Building construction");
        System.out.println("Duration in years: "+ durationInYears);
    }

    Contract(double contractAmount){
        System.out.println("Contract amount: "+ contractAmount);
    }
}

public class ContractDetails {
    public static void main(String[] args){

        Contract contract1=new Contract(5);
        Contract contract=new Contract(50000.00);
    }
}
