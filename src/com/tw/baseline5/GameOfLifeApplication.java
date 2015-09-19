//implements the Game of life application
package com.tw.baseline5;

import java.util.Scanner;

public class GameOfLifeApplication {

    public static void main(String[] args) {
        GameOfLifeApplication gameOfLifeApplication = new GameOfLifeApplication();
        gameOfLifeApplication.start();
    }

    public void start() {
        InputReader inputReader = new InputReader(new Scanner(System.in));
        String input = inputReader.getInput();

        String[] cellRows = input.split("\n");
        String[][] cellBlock = new String[cellRows.length][cellRows.length];

        for(int i = 0; i < cellRows.length; i++) {
            cellBlock[i] = cellRows[i].split("");
        }

        new Display(cellBlock).print();
    }
}
