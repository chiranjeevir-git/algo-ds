package com.codersbuffet.watermanagement.service;

import com.codersbuffet.watermanagement.dtos.InputDTO;

import static com.codersbuffet.watermanagement.constants.WaterManagementConstants.*;

public class WaterService {
    public int getFinalWaterConsumption(InputDTO inputDTO) {

        int totalWaterConsumption = inputDTO.getTotalNumberOfGuests() *
                WATER_CONSUMPTION_PER_HEAD *
                NUMBER_OF_DAYS_IN_MONTH;

        if (inputDTO.getRoomType() == TWO_BHK) {
            totalWaterConsumption += TWO_BHK_WATER_PER_MONTH;
        } else {
            totalWaterConsumption += THREE_BHK_WATER_PER_MONTH;
        }

        return totalWaterConsumption;
    }
}
