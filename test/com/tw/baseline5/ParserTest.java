package com.tw.baseline5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void shouldReturnArrayForString00() {
        String input = "XX\n" +
                        "XX";
        String[][] splitInput = {{"X", "X"}, {"X", "X"}};
        Parser parser =  new Parser();

        assertEquals("X", splitInput[0][0]);
    }

    @Test
    public void shouldReturnArrayForString01() {
        String input = "XX\n" +
                "XX";
        String[][] splitInput = {{"X", "X"}, {"X", "X"}};
        Parser parser =  new Parser();

        assertEquals("X", splitInput[0][1]);
    }

    @Test
    public void shouldReturnArrayForString10() {
        String input = "XX\n" +
                "XX";
        String[][] splitInput = {{"X", "X"}, {"X", "X"}};
        Parser parser =  new Parser();

        assertEquals("X", splitInput[1][0]);
    }

    @Test
    public void shouldReturnArrayForString11() {
        String input = "XX\n" +
                "XX";
        String[][] splitInput = {{"X", "X"}, {"X", "X"}};
        Parser parser =  new Parser();

        assertEquals("X", splitInput[1][1]);
    }
}
