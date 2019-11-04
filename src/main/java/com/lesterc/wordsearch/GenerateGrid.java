package com.lesterc.wordsearch;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateGrid {

    public char[][] generateRandomGrid(int rows, int columns) {
        char[][] grid = new char[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = RandomStringUtils.randomAlphabetic(1).toUpperCase().charAt(0);
            }
        }

        return grid;
    }
}
