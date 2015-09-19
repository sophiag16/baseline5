//implements the Game of life application
package com.tw.baseline5;

import java.util.Scanner;

public class GameOfLifeApplication {

    public static void main(String[] args) {
        GameOfLifeApplication gameOfLifeApplication = new GameOfLifeApplication();
        gameOfLifeApplication.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine() +"\n" + scanner.nextLine();
        System.out.println(input);
    }
}
