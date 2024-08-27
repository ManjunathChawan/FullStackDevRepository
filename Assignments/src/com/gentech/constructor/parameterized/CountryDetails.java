package com.gentech.constructor.parameterized;

class Country {
    String name;
    String countryCode;
    String countryCapital;
    int noOfStates;

    Country(String name, String countryCode, String countryCapital, int noOfStates){
        System.out.println("----------Country----------");
        System.out.println("Country name: "+name);
        System.out.println("Country capital: "+countryCapital);
        System.out.println("Country code: "+countryCode);
        System.out.println("No of states: "+noOfStates);

        System.out.println("--------------------------------------");

    }

}

class State {
    String stateName;
    String stateCapital;
    int noOfDistricts;

    State(String stateName, String stateCapital, int noOfDistricts){
        System.out.println("----------State----------");
        System.out.println("State name: "+stateName);
        System.out.println("State capital: "+stateCapital);
        System.out.println("Districts: "+noOfDistricts);
        System.out.println("--------------------------------------");
    }

}

class District {
    String distName;
    int noOfTaluks;
    String otherName;

    District(String distName, int noOfTaluks, String otherName){
        System.out.println("--------District------");
        System.out.println("District name: "+distName);
        System.out.println("No of taluks: "+noOfTaluks);
        System.out.println("Other name: "+otherName);
        System.out.println("--------------------------------------");

    }

}

class Village {
    String villageName;
    int pinCode;
    String hobli;
    int population;

    Village(String villageName, int pinCode, String hobli, int population){
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
        Country country = new Country("India", "Delhi", "+91", 29);
        Country country1 = new Country("India", "Delhi", "+91", 29);

        State state = new State("Karnataka", "Bengaluru", 31);
        State state1 = new State("Karnataka", "Bengaluru", 31);

        District district=new District("Yadgir", 6, "Girinadu");
        District district1=new District("Bengaluru", 6, "Silicon City");

        Village village = new Village("Bailapur", 585215, "Kakkera", 1212);
        Village village1 = new Village("Bailapur tanda", 585215, "Kakkera", 1212);
    }
}
