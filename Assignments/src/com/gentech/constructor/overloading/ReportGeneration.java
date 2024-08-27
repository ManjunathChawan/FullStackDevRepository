package com.gentech.constructor.overloading;

class Report{
    Report(String reportName){
        System.out.println("Report name: "+ reportName);
    }

    Report(int noOfPage){
        this("Java Report");
        System.out.println("No of pages: "+ noOfPage);
    }

    Report(double amount){
        System.out.println("Amount: "+ amount);
    }

}

public class ReportGeneration {
    public static void main(String[] args) {

        Report report1 = new Report(123);
        Report report2 = new Report(500.23);
    }
}
