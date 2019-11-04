package com.lesterc.wordsearch;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class GenerateGridTest {

    @Test
    public void testGenerateRandomGrid() {
        GenerateGrid generateGrid = new GenerateGrid();
        char[][] result = generateGrid.generateRandomGrid(5, 5);

        Assert.assertThat("Expected size 5", result.length, CoreMatchers.is(5));

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                System.out.print(result[row][col]);
            }
        }
    }
}
