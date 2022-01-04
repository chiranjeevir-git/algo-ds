package com.codersbuffet.watermanagement.dtos;

public class InputDTO {

    private int roomType;
    private int corporationWaterRatio;
    private int boreWellWaterRatio;
    private int totalNumberOfGuests;

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getCorporationWaterRatio() {
        return corporationWaterRatio;
    }

    public void setCorporationWaterRatio(int corporationWaterRatio) {
        this.corporationWaterRatio = corporationWaterRatio;
    }

    public int getBoreWellWaterRatio() {
        return boreWellWaterRatio;
    }

    public void setBoreWellWaterRatio(int boreWellWaterRatio) {
        this.boreWellWaterRatio = boreWellWaterRatio;
    }

    public int getTotalNumberOfGuests() {
        return totalNumberOfGuests;
    }

    public void setTotalNumberOfGuests(int totalNumberOfGuests) {
        this.totalNumberOfGuests = totalNumberOfGuests;
    }
}
