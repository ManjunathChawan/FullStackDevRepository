package com.gentech.javatest2;
class LaptopName{

    static String laptopBrand(){
        String laptopName="Lenovo";
        return laptopName;
    }
}

public class Question2 {
    public static void main(String[] args) {
        String res=LaptopName.laptopBrand();
        System.out.println(res);
    }
}
