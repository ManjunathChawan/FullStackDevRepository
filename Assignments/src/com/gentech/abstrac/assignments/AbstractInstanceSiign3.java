package com.gentech.abstrac.assignments;

abstract class College1
{
    String CollName;
    int collId;
    String address;

    {
        CollName="SDMCET";
        System.out.println("College Name :"+CollName);
        collId=1231;
        System.out.println("College Id :"+collId);
        address="Dharwad";
        System.out.println("address :"+address);
    }
}
class College2 extends College1
{

}
public class AbstractInstanceSiign3 {
    public static void main(String[] args) {
        College2 ob1=new College2();
    }
}
