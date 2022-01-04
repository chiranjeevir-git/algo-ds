package com.codersbuffet.watermanagement;

import com.codersbuffet.dsa.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class WaterManagementFileNotFoundTest {
    private  final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void basicTestWithWrongFilePath(){
        Main.main(new String [] {"sample_input/file_not_exist.txt"});
        Assertions.assertEquals(outContent.toString(), "0 0");
    }

}