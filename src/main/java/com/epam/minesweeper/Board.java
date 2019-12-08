package com.epam.minesweeper;

public class Board {

    private Cell[][] cells;
    private int sizeH;
    private int sizeV;
    private int maxBombsAmount;

    public Board(int sizeH, int sizeV, int maxBombsAmount) {
        this.sizeH = sizeH;
        this.sizeV = sizeV;
        this.maxBombsAmount = maxBombsAmount;
        setCells();
        setNeighboringBombs();
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

    private void setNeighboringBombs() {
        int neighboringBombs;
        for (int i = 0; i < sizeH; i++) {
            for (int j = 0; j < sizeV; j++) {
                neighboringBombs = 0;
                if ((i != 0) && (j != 0) && cells[i - 1][j - 1].isBomb()) {
                    neighboringBombs++;
                }
                if ((i != 0) && cells[i - 1][j].isBomb()) {
                    neighboringBombs++;
                }
                if ((i != 0) && (j != sizeV - 1) && cells[i - 1][j + 1].isBomb()) {
                    neighboringBombs++;
                }
                if ((j != 0) && cells[i][j - 1].isBomb()) {
                    neighboringBombs++;
                }
                if ((j != sizeV - 1) && cells[i][j + 1].isBomb()) {
                    neighboringBombs++;
                }
                if ((i != sizeH - 1) && (j != 0) && cells[i + 1][j - 1].isBomb()) {
                    neighboringBombs++;
                }
                if ((i != sizeH - 1) && cells[i + 1][j].isBomb()) {
                    neighboringBombs++;
                }
                if ((i != sizeH - 1) && (j != sizeV - 1) && cells[i + 1][j + 1].isBomb()) {
                    neighboringBombs++;
                }
                cells[i][j].setNeighboringBombs(cells[i][j].getNeighboringBombs() + neighboringBombs);
            }
        }
    }

    public void printBoard() {

        for (int j = 0; j < sizeV; j++) {
            for (int i = 0; i < sizeH; i++) {
                System.out.print("|");
                if (cells[i][j].isBomb()) {
                    System.out.print("*");
                } else if (cells[i][j].getNeighboringBombs() == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(cells[i][j].getNeighboringBombs());
                }
            }
            System.out.println("|");
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public int getSizeH() {
        return sizeH;
    }

    public int getSizeV() {
        return sizeV;
    }

    public int getMaxBombsAmount() {
        return maxBombsAmount;
    }
}
