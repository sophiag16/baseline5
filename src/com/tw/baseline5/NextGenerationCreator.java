//creates new generation block from old generation block
package com.tw.baseline5;

import java.util.ArrayList;

public class NextGenerationCreator {
    private String[][] oldCellBlock;

    public NextGenerationCreator(String[][] oldCellBlock) {
        this.oldCellBlock = oldCellBlock;
    }

    public String[][] createNextGen() {
        int length = oldCellBlock.length;
        String[][] cellBlockNew = new String[length][length];

        for (int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                ArrayList<String> neighbour = new ArrayList<String>();
                int numberOfLiveNeighbours = 0;
                if (i != 0)
                    neighbour.add(oldCellBlock[i-1][j]);
                if (i != length-1)
                    neighbour.add(oldCellBlock[i+1][j]);
                if (j != 0)
                    neighbour.add(oldCellBlock[i][j-1]);
                if (j != length-1)
                    neighbour.add(oldCellBlock[i][j+1]);
                if (i != 0 && j!=0)
                    neighbour.add(oldCellBlock[i-1][j-1]);
                if (i != length-1 && j!= length-1)
                    neighbour.add(oldCellBlock[i+1][j+1]);
                if (i != 0 && j!= length-1)
                    neighbour.add(oldCellBlock[i-1][j+1]);
                if (i != length-1 && j!= 0)
                    neighbour.add(oldCellBlock[i+1][j-1]);

                for(int k = 0; k < neighbour.size(); k++) {
                    if (neighbour.get(k) == "X")
                        numberOfLiveNeighbours++;
                }

                if(numberOfLiveNeighbours == 3)
                    cellBlockNew[i][j] = "X";
                else if (numberOfLiveNeighbours < 2 || numberOfLiveNeighbours > 3)
                    cellBlockNew[i][j] = "-";
                else
                    cellBlockNew[i][j] = oldCellBlock[i][j];
            }
        }
        return cellBlockNew;
    }
}
