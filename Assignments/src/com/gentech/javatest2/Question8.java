package com.gentech.javatest2;

class OneDimensionalByteArray{
    byte[] arrayElements(){
        byte[] arr = {10,20,30,40,50};
        return arr;
    }
}
public class Question8 {
    public static void main(String[] args) {
        OneDimensionalByteArray obj = new OneDimensionalByteArray();
        byte[] res = obj.arrayElements();
        for(byte element:res){
            System.out.println(element);
        }
    }
}
