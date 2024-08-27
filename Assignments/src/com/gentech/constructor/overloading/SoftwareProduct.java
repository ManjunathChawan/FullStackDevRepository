package com.gentech.constructor.overloading;

class Product{
    Product(String name){
        System.out.println("Product name:"+name);
    }

    Product(int year){
        this("Microsoft Office");
        System.out.println("Launch year"+ year);
    }

    Product(float version){
        System.out.println("Version: "+ version);
    }

    Product(double amount){
        System.out.print("Amount: "+amount);
    }
}

public class SoftwareProduct {
    public static void main(String arge[]){
        Product product=new Product(2023);
        Product product1=new Product(1.1f);
        Product product2=new Product(123456.0);
    }
}
