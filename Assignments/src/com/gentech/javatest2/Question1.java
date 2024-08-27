package com.gentech.javatest2;

class OneDimensionalArray{
static boolean[] arrayElements(){
    boolean[] arr = {true,false};
    return arr;
}
}
public class Question1 {
    public static void main(String[] args) {
        boolean[] res = OneDimensionalArray.arrayElements();
        for(boolean element:res){
            System.out.println(element);
        }
    }
}
