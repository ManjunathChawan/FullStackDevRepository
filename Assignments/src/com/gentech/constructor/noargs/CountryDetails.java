package com.gentech.constructor.noargs;

class Country{
    String name;
    String countryCode;
    String countryCapital;
    int noOfStates;

    Country(){
        name="India";
        countryCode="+91";
        countryCapital="New Delhi";
        noOfStates=29;
        System.out.println("----------Country----------");
        System.out.println("Country name: "+name);
        System.out.println("Country capital: "+countryCapital);
        System.out.println("Country code: "+countryCode);
        System.out.println("No of states: "+noOfStates);

        System.out.println("--------------------------------------");
    }
}

class State{
    String stateName;
    String stateCapital;
    int noOfDistricts;

    State(){
        stateName = "Karnataka";
        stateCapital = "Bengaluru";
        noOfDistricts = 31;
        System.out.println("----------State----------");
        System.out.println("State name: "+stateName);
        System.out.println("State capital: "+stateCapital);
        System.out.println("Districts: "+noOfDistricts);
        System.out.println("--------------------------------------");
    }

}

class District{
    String distName;
    int noOfTaluks;
    String otherName;

    District(){
        distName = "yadgir";
        noOfTaluks= 6;
        otherName = "Girinadu";
        System.out.println("--------District------");
        System.out.println("District name: "+distName);
        System.out.println("No of taluks: "+noOfTaluks);
        System.out.println("Other name: "+otherName);
        System.out.println("--------------------------------------");
    }

}

class Village{
    String villageName;
    int pinCode;
    String hobli;
    int population;

    Village(){
        villageName = "Bailapur tanda";
        pinCode = 585215;
        hobli = "Kakkera";
        population = 1000;
        System.out.println("----------Village---------");
        System.out.println("Village name: "+villageName);
        System.out.println("Village Pincode: "+pinCode);
        System.out.println("Village hobli: "+hobli);
        System.out.println("Population: "+population);
        System.out.println("------------------------------------");
    }
}

public class CountryDetails {
    public static void main(String[] args){
        Country country=new Country();
        State state=new State();
        District district=new District();
        Village village=new Village();
    }
}
