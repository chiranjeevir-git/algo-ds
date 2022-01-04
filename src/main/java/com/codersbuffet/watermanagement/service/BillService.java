package com.codersbuffet.watermanagement.service;

import com.codersbuffet.watermanagement.dtos.InputDTO;

import static com.codersbuffet.watermanagement.constants.WaterManagementConstants.*;

public class BillService {

    public int getFinalBill(InputDTO inputDTO) {
        double totalBill;
        int corporationWaterConsumption;
        int boreWellWaterConsumption;

        int consumptionFromGuests = inputDTO.getTotalNumberOfGuests() *
                WATER_CONSUMPTION_PER_HEAD *
                NUMBER_OF_DAYS_IN_MONTH;
        int ratio_sum = (inputDTO.getCorporationWaterRatio() +
                inputDTO.getBoreWellWaterRatio());
        if (inputDTO.getRoomType() == TWO_BHK) {
            corporationWaterConsumption = Math.round(TWO_BHK_WATER_PER_MONTH *
                    inputDTO.getCorporationWaterRatio() / ratio_sum);

            boreWellWaterConsumption = Math.round(TWO_BHK_WATER_PER_MONTH *
                    inputDTO.getBoreWellWaterRatio() / ratio_sum);

        } else {
            corporationWaterConsumption = Math.round(THREE_BHK_WATER_PER_MONTH *
                    inputDTO.getCorporationWaterRatio() / ratio_sum);

            boreWellWaterConsumption = Math.round(THREE_BHK_WATER_PER_MONTH *
                    inputDTO.getBoreWellWaterRatio() / ratio_sum);
        }

        totalBill = corporationWaterConsumption * CORPORATION_WATER_FEE +
                boreWellWaterConsumption * BORE_WELL_WATER_FEE;

        totalBill = totalBill + getGuestsBill(consumptionFromGuests);

        return (int) Math.round(totalBill);

    }

    private int getGuestsBill(int waterConsumptionFromGuests) {
        int billFromGuests;

        if (waterConsumptionFromGuests <= 500) {
            billFromGuests = waterConsumptionFromGuests * TANKER_0L_TO_500L_FEE;

        } else if (waterConsumptionFromGuests <= 1500) {
            billFromGuests = 500 * TANKER_0L_TO_500L_FEE +
                    (waterConsumptionFromGuests - 500) * TANKER_501L_TO_1500L_FEE;

        } else if (waterConsumptionFromGuests <= 3000) {
            billFromGuests = 500 * TANKER_0L_TO_500L_FEE +
                    1000 * TANKER_501L_TO_1500L_FEE +
                    (waterConsumptionFromGuests - 1500) * TANKER_1501L_TO_3000L_FEE;
        } else {
            billFromGuests = 500 * TANKER_0L_TO_500L_FEE +
                    1000 * TANKER_501L_TO_1500L_FEE +
                    1500 * TANKER_1501L_TO_3000L_FEE +
                    (waterConsumptionFromGuests - 3000) * TANKER_3000L_ONWARDS;
        }

        return billFromGuests;
    }
}
