package com.tw.baseline5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class GameOfLifeApplicationTest {
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
        GameOfLifeApplication gameOfLifeApplication = new GameOfLifeApplication();
        String input = "XX\n" +
                       "XX\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        gameOfLifeApplication.start();

        assertEquals(input, byteArrayOutputStream.toString());
    }
}
