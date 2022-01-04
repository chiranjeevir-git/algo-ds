package com.codersbuffet.dsa;

import com.codersbuffet.watermanagement.controller.WaterManagementController;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
	    //String filePath = args[0];
        String filePath = "C:\\Users\\User\\Downloads\\java-maven\\java-maven-starter-kit-master\\sample_input\\input1.txt";
        WaterManagementController waterManagementController = new WaterManagementController();
        System.out.print(waterManagementController.getWaterConsumptionAndBill(filePath));
        String[] returnArray = new String[2];
        //String a = "";
        String reduce = Stream.of(returnArray).reduce("", (a, b) -> a + b);
    }
}
