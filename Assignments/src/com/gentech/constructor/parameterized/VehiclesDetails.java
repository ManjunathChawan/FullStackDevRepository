package com.gentech.constructor.parameterized;

class TwoWheelers {
    String companyName;
    String model;
    boolean isBike;
    boolean isScooty;
    boolean isEv;
    boolean isPetrol;

    TwoWheelers(String companyName, String model, boolean isBike, boolean isScooty,
                boolean isEv, boolean isPetrol){
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

class FourWheeler {
    String companyName;
    String model;
    boolean isEv;
    boolean isPetrol;
    boolean isDiesel;
    boolean isCng;
    boolean isManualGear;
    boolean isAutomaticGear;

    FourWheeler(String companyName, String model, boolean isEv, boolean isPetrol, boolean isCng,
                boolean isDiesel, boolean isManualGear, boolean isAutomaticGear){
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

class HeavyVehicles {
    String companyName;
    String model;
    int noOfTyres;
    String vehicleType;

    HeavyVehicles(String companyName, String model, int noOfTyres, String vehicleType){
        System.out.println("----------Heavy Vehicles Info----------");
        System.out.println("Company name: "+companyName);
        System.out.println("Model: "+model);
        System.out.println("Vehicle type: "+vehicleType);
        System.out.println("No of Tyres: "+noOfTyres);
        System.out.println("-------------------------------------------");

    }
}
public class VehiclesDetails {
    public static void main(String args[]){
        TwoWheelers twoWheelers=new TwoWheelers("Yamaha","MT-15",true,
                false, false, true);
        TwoWheelers twoWheelers1=new TwoWheelers("Yamaha","MT-15 Version2",
                true,false, false, true);

        FourWheeler fourWheeler=new FourWheeler("Maruti Suzuki", "Swift Dzire",
                false, false, true,true,true,false);

        FourWheeler fourWheeler1=new FourWheeler("Maruti Suzuki", "Swift Dzire",
                false, false, true,true,true,false);

        HeavyVehicles heavyVehicles=new HeavyVehicles("Tata","Tipper",
                10, "Loader");
        HeavyVehicles heavyVehicles1=new HeavyVehicles("Tata","Tipper",
                10, "Loader");
    }
}
