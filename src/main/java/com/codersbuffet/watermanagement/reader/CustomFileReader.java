package com.codersbuffet.watermanagement.reader;

import com.codersbuffet.watermanagement.dtos.InputDTO;

public interface CustomFileReader {
    InputDTO getInputDto(String path);
}
