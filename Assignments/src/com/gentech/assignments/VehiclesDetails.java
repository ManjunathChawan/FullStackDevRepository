package com.gentech.assignments;

class TwoWheelers{
    String companyName;
    String model;
    boolean isBike;
    boolean isScooty;
    boolean isEv;
    boolean isPetrol;

}

class FourWheeler{
    String companyName;
    String model;
    boolean isEv;
    boolean isPetrol;
    boolean isDiesel;
    boolean isCng;
    boolean isManualGear;
    boolean isAutomaticGear;
}

class HeavyVehicles{
    String companyName;
    String model;
    int noOfTyres;
    String vehicleType;


}

public class VehiclesDetails {
    public static void main(String[] args){
        TwoWheelers twoWheelers= new TwoWheelers();
        twoWheelers.companyName = "Yamaha";
        twoWheelers.model = "MT-15";
        //twoWheelers.isEv=false;
        twoWheelers.isBike=true;
        twoWheelers.isScooty=false;
        twoWheelers.isEv=false;
        twoWheelers.isPetrol=true;
        System.out.println("-------Two Wheelers Info------");
        System.out.println("Company name: "+twoWheelers.companyName);
        System.out.println("Company model: "+twoWheelers.model);
        System.out.println("Bike: "+twoWheelers.isBike);
        System.out.println("Scooty: "+twoWheelers.isScooty);
        System.out.println("Electrical: "+twoWheelers.isEv);
        System.out.println("Petrol: "+twoWheelers.isPetrol);
        System.out.println("--------------------------------");

        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.companyName = "Suzuki";
        fourWheeler.model="Dzire";
        fourWheeler.isEv=true;
        fourWheeler.isCng=false;
        fourWheeler.isPetrol=false;
        fourWheeler.isDiesel=false;
        fourWheeler.isAutomaticGear=true;
        fourWheeler.isManualGear=false;
        System.out.println("-------------Four Wheeler Information-----------------");
        System.out.println("Company name: "+fourWheeler.companyName);
        System.out.println("Model: "+fourWheeler.model);
        System.out.println("Electric: "+fourWheeler.isEv);
        System.out.println("Diesel: "+fourWheeler.isDiesel);
        System.out.println("CNG: "+fourWheeler.isCng);
        System.out.println("Petrol: "+fourWheeler.isPetrol);
        System.out.println("Automatic gear: "+fourWheeler.isAutomaticGear);
        System.out.println("Manual gear: "+fourWheeler.isManualGear);
        System.out.println("----------------------------------------------");

        HeavyVehicles heavyVehicles = new HeavyVehicles();
        heavyVehicles.companyName = "Bharat Benz";
        heavyVehicles.model = "2016";
        heavyVehicles.vehicleType = "Loading";
        heavyVehicles.noOfTyres= 8;
        System.out.println("----------Heavy Vehicles Info----------");
        System.out.println("Company name: "+heavyVehicles.companyName);
        System.out.println("Model: "+heavyVehicles.model);
        System.out.println("Vehicle type: "+heavyVehicles.vehicleType);
        System.out.println("No of Tyres: "+heavyVehicles.noOfTyres);
        System.out.println("-------------------------------------------");


    }
}
