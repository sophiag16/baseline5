package com.tw.baseline5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DisplayTest {
    private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @After
    public void CleanUpStreams() {
        System.setOut(System.out);
    }

    @Test
    public void shouldTakeInA2X2BlockOfXsAndDisplayIt() {
        String[][] someString = {{"X","", "X"}, {"X","", "X"}};
        Display display = new Display(someString);

        display.print();

        assertEquals("XX\n" +
                    "XX\n", byteArrayOutputStream.toString());
    }
}
