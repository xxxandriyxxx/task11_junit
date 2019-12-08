package minesweeper;

public class Board {

    private Cell[][] cells;
    private int sizeH;
    private int sizeV;
    private int maxBombsAmount;

    public Board(int sizeH, int sizeV, int maxBombsAmount) {
        this.sizeH = sizeH;
        this.sizeV = sizeV;
        this.maxBombsAmount = maxBombsAmount;
    }

}
