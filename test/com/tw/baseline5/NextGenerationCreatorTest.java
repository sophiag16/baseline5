package com.tw.baseline5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextGenerationCreatorTest {

    @Test
    public void shouldReturnNextGeneration00() {
        String[][] oldGen = {{"-", "X", "-"}, {"-", "X", "-"}, {"-", "X", "-"}};
        NextGenerationCreator nextGenerationCreator = new NextGenerationCreator(oldGen);
        String[][] newGen = {{"-", "-", "-"}, {"X", "X", "X"}, {"-", "-", "-"}};

        assertEquals(newGen[0][0], (nextGenerationCreator.createNextGen())[0][0]);
    }

    @Test
    public void shouldReturnNextGeneration22() {
        String[][] oldGen = {{"-", "X", "-"}, {"-", "X", "-"}, {"-", "X", "-"}};
        NextGenerationCreator nextGenerationCreator = new NextGenerationCreator(oldGen);
        String[][] newGen = {{"-", "-", "-"}, {"X", "X", "X"}, {"-", "-", "-"}};

        assertEquals(newGen[2][2], (nextGenerationCreator.createNextGen())[2][2]);
    }
}
