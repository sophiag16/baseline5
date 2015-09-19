//reads input from console and returns it as a string
package com.tw.baseline5;

import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.nextLine() + "\n" + scanner.nextLine();
    }
}
