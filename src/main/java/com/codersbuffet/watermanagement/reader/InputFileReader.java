package com.codersbuffet.watermanagement.reader;


import com.codersbuffet.watermanagement.dtos.InputDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFileReader implements CustomFileReader {

    @Override
    public InputDTO getInputDto(String path) {
        try {
            int lineCounter = 0, numberOfGuests = 0;
            FileInputStream fileInputStream = new FileInputStream(path);
            Scanner scanner = new Scanner(fileInputStream);    //file to be scanned
            InputDTO inputDTO = new InputDTO();
            while ((scanner.hasNext())) {
                lineCounter++;
                String line = scanner.nextLine();
                String[] contents = line.split(" ");
                if (lineCounter == 1) {
                    inputDTO.setRoomType(Integer.parseInt(contents[1]));
                    String[] ratios = contents[2].split(":");
                    inputDTO.setCorporationWaterRatio(Integer.parseInt(ratios[0]));
                    inputDTO.setBoreWellWaterRatio(Integer.parseInt(ratios[1]));
                } else if (lineCounter > 1 && contents[0].equals("ADD_GUESTS")) {
                    numberOfGuests += Integer.parseInt(contents[1]);
                }
            }
            inputDTO.setTotalNumberOfGuests(numberOfGuests);

            return inputDTO;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }


}
