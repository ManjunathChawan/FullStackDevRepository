package com.gentech.constructor.noargs;

class TwoWheelers{
    String companyName;
    String model;
    boolean isBike;
    boolean isScooty;
    boolean isEv;
    boolean isPetrol;

    TwoWheelers(){
        companyName = "Yamaha";
        model = "MT-15";
        isBike=true;
        isScooty=false;
        isEv=false;
        isPetrol=true;

        System.out.println("-------Two Wheelers Info------");
        System.out.println("Company name: "+companyName);
        System.out.println("Company model: "+model);
        System.out.println("Bike: "+isBike);
        System.out.println("Scooty: "+isScooty);
        System.out.println("Electrical: "+isEv);
        System.out.println("Petrol: "+isPetrol);
        System.out.println("--------------------------------");
    }

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

    FourWheeler(){
        companyName = "Suzuki";
        model="Dzire";
        isEv=true;
        isCng=false;
        isPetrol=false;
        isDiesel=false;
        isAutomaticGear=true;
        isManualGear=false;

        System.out.println("-------------Four Wheeler Information-----------------");
        System.out.println("Company name: "+companyName);
        System.out.println("Model: "+model);
        System.out.println("Electric: "+isEv);
        System.out.println("Diesel: "+isDiesel);
        System.out.println("CNG: "+isCng);
        System.out.println("Petrol: "+isPetrol);
        System.out.println("Automatic gear: "+isAutomaticGear);
        System.out.println("Manual gear: "+isManualGear);
        System.out.println("----------------------------------------------");
    }
}

class HeavyVehicles{
    String companyName;
    String model;
    int noOfTyres;
    String vehicleType;

    HeavyVehicles(){
        companyName = "Bharat Benz";
        model = "2016";
        vehicleType = "Loading";
        noOfTyres= 8;

        System.out.println("----------Heavy Vehicles Info----------");
        System.out.println("Company name: "+companyName);
        System.out.println("Model: "+model);
        System.out.println("Vehicle type: "+vehicleType);
        System.out.println("No of Tyres: "+noOfTyres);
        System.out.println("-------------------------------------------");
    }


}
public class VehiclesDetails {
    public static void main(String[] args){
        TwoWheelers twoWheelers = new TwoWheelers();
        FourWheeler fourWheeler=new FourWheeler();
        HeavyVehicles heavyVehicles=new HeavyVehicles();
    }
}
