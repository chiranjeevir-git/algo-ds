package com.codersbuffet.watermanagement;

import com.codersbuffet.dsa.Main;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class WaterManagementTest {
    private  final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void basicTest() {
        Main.main(new String[]{"sample_input/input1.txt"});
        Assertions.assertEquals(outContent.toString(), "2400 5215");
    }

}