package com.gentech.constructor.overloading;

class Profile{
    Profile(String name){
        System.out.println("Name: "+ name);
    }

    Profile(int id){
        this("Manjunath");
        System.out.println("Id: "+ id);
    }

    Profile(double salary){
        System.out.println("Salary: "+ salary);
    }

    Profile(char gender){
        System.out.println("Gender: "+ gender);
    }

    Profile(boolean wfh){
        System.out.println("Work from home: "+wfh);
    }
}

public class ProfileDemo {
    public static void main(String args[]){

        Profile profile = new Profile(1);
        Profile profile1=new Profile('M');
        Profile profile2  = new Profile(20000.0);
        Profile profile3=new Profile(true);
    }
}
