//reads input from console and returns it as a string
package com.tw.baseline5;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        String input = scanner.nextLine();
        String[] splitInput = input.split("");
        int count = 0;
        do {
            input += "\n" + scanner.nextLine();
            count++;
        }while(count < splitInput.length-2);
        return input;
    }
}
