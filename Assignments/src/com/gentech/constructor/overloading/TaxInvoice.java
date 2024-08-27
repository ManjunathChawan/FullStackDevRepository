package com.gentech.constructor.overloading;


class Invoice{
    Invoice(String name){
        System.out.println("Name: "+ name);
    }

    Invoice(long id){
        this("Manjunath");
        System.out.println("Id: "+ id);
    }


    Invoice(double amount){
        System.out.println("Amount :"+ amount);
    }

    Invoice(){

    }
}

public class TaxInvoice {
    public static void main(String[] args){
        Invoice invoice = new Invoice(1234567);
        Invoice invoice2=new Invoice(2000.23);
    }
}
