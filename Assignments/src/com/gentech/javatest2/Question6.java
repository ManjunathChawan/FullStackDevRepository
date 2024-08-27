package com.gentech.javatest2;

class LogicalOperator{
    boolean logicalAnd(int a,int b){
        if(a>=100 && b<99)
            return true;
        else
            return false;
    }
}
public class Question6 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        LogicalOperator obj = new LogicalOperator();
        boolean res=obj.logicalAnd(a,b);
        System.out.println(res);
    }
}
