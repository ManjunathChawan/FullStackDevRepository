package com.gentech.assignments;

class Country{
    String name;
    String countryCode;
    String countryCapital;
    int noOfStates;

}

class State{
    String stateName;
    String stateCapital;
    int noOfDistricts;

}

class District{
    String distName;
    int noOfTaluks;

}

class Village{
    String villageName;
    int pinCode;
    String hobli;

}



public class CountryDetails {
    public static void main(String[] args){
        Country country = new Country();
        country.name="India";
        country.countryCode="+91";
        country.countryCapital="New Delhi";
        country.noOfStates=29;
        System.out.println("----------Country----------");
        System.out.println("Country name: "+country.name);
        System.out.println("Country capital: "+country.countryCapital);
        System.out.println("Country code: "+country.countryCode);
        System.out.println("No of states: "+country.noOfStates);

        System.out.println("--------------------------------------");

        State state = new State();
        state.stateName = "Karnataka";
        state.stateCapital = "Bengaluru";
        state.noOfDistricts = 31;
        System.out.println("----------State----------");
        System.out.println("State name: "+state.stateName);
        System.out.println("State capital: "+state.stateCapital);
        System.out.println("Districts: "+state.noOfDistricts);
        System.out.println("--------------------------------------");

        District district = new District();
        district.distName = "yadgir";
        district.noOfTaluks= 6;
        System.out.println("--------District------");
        System.out.println("District name: "+district.distName);
        System.out.println("No of taluks: "+district.noOfTaluks);
        System.out.println("--------------------------------------");

        Village village = new Village();
        village.villageName = "Bailapur tanda";
        village.pinCode = 585215;
        village.hobli = "Kakkera";
        System.out.println("----------Village---------");
        System.out.println("Village name: "+village.villageName);
        System.out.println("Village Pincode: "+village.pinCode);
        System.out.println("Village hobli: "+village.hobli);
        System.out.println("------------------------------------");


    }
}
