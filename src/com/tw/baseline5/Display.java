//diplays string given to it
package com.tw.baseline5;

public class Display {
    private String[][] stringToDisplay;

    public Display(String[][] stringToDisplay) {
        this.stringToDisplay = stringToDisplay;
    }


    public void print() {
        for(int i = 0; i < stringToDisplay.length; i++) {
            for(int j = 0; j<stringToDisplay.length; j++) {
                System.out.print(stringToDisplay[i][j]);
            }
            System.out.println("");
        }
    }
}
