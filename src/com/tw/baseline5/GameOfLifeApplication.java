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
        System.out.println(input);
    }
}
