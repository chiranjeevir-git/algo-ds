package com.codersbuffet.watermanagement.dtos;

public class OutputDTO {

    @Override
    public String toString() {
        return totalWaterUsage +" "+ totalBill;
    }

    public void setTotalWaterUsage(int totalWaterUsage) {
        this.totalWaterUsage = totalWaterUsage;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    private int totalWaterUsage;
    private int totalBill;

}
