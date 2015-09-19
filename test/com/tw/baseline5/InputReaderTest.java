package com.tw.baseline5;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class InputReaderTest {

    @Test
    public void shouldTakeInA2x2BlockOfXsAndReturnItAsAString() {
        String input = "XX\n" +
                       "XX";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        InputReader inputReader = new InputReader(new Scanner(System.in));

        assertEquals("XX\n" +
                     "XX", inputReader.getInput());
    }

    @Test
    public void shouldTakeInA3x3BlockOfXsAndReturnItAsAString() {
        String input = "XX-\n" +
                       "X-X\n" +
                       "-X-";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);
        InputReader inputReader = new InputReader(new Scanner(System.in));

        assertEquals("XX-\n" +
                    "X-X\n" +
                    "-X-", inputReader.getInput());
    }
}
