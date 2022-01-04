package com.codersbuffet.watermanagement.controller;

import com.codersbuffet.watermanagement.dtos.OutputDTO;
import com.codersbuffet.watermanagement.reader.CustomFileReader;
import com.codersbuffet.watermanagement.reader.InputFileReader;
import com.codersbuffet.watermanagement.service.BillService;
import com.codersbuffet.watermanagement.service.WaterService;
import com.codersbuffet.watermanagement.dtos.InputDTO;

public class WaterManagementController {

    public OutputDTO getWaterConsumptionAndBill(String path) {
        BillService billService = new BillService();
        WaterService waterService = new WaterService();

        CustomFileReader inputCustomFileReader = new InputFileReader();

        InputDTO inputDTO = inputCustomFileReader.getInputDto(path);

        OutputDTO outputDTO = new OutputDTO();
        if (inputDTO != null) {
            outputDTO.setTotalBill(billService.getFinalBill(inputDTO));
            outputDTO.setTotalWaterUsage(waterService.getFinalWaterConsumption(inputDTO));
        }
        return outputDTO;
    }

}
