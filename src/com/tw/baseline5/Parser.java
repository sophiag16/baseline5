//takes a string and returns a 2D array
package com.tw.baseline5;

public class Parser {

    public String[][] parse(String input) {
        String[] cellRows = input.split("\n");
        String[][] cellBlock = new String[cellRows.length][cellRows.length];

        for(int i = 0; i < cellRows.length; i++) {
            cellBlock[i] = cellRows[i].split("");
        }

        return cellBlock;
    }
}
