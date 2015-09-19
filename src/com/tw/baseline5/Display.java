//diplays string given to it
package com.tw.baseline5;

public class Display {
    private String stringToDisplay;

    public Display(String stringToDisplay) {
        this.stringToDisplay = stringToDisplay;
    }


    public void print() {
        System.out.println(stringToDisplay);
    }
}
