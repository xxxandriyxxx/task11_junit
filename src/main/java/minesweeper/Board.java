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

    private void setCells() {
        int addressH;
        int addressV;
        cells = new Cell[sizeH][sizeV];
        for (int i = 0; i < sizeH; i++) {
            for (int j = 0; j < sizeV; j++) {
                cells[i][j] = new Cell();
            }
        }
        if (maxBombsAmount > (sizeH * sizeV)) {
            maxBombsAmount = sizeH * sizeV;
        }
        for (int i = 0; i < maxBombsAmount; i++) {
            addressH = (int) (Math.random() * sizeH);
            addressV = (int) (Math.random() * sizeV);
            cells[addressH][addressV].setBomb(true);
        }
    }


}
