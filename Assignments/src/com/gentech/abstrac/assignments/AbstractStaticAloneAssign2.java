package com.gentech.abstrac.assignments;

abstract class College
{
    static String CollName;
    static int collId;
    static String address;
    static
    {
        CollName="SDMCET";
        System.out.println("College Name :"+CollName);
        collId=1001;
        System.out.println("College Id :"+collId);
        address="Dharwad";
        System.out.println("address :"+address);
    }

}
class SubClass extends College
{

}
public class AbstractStaticAloneAssign2 {
    public static void main(String[] args) {
        College obj1=new SubClass();
    }
}
