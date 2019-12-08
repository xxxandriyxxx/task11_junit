package minesweeper;

public class Cell {

    private boolean isBomb;
    private int neighboringBombs;

    public Cell() {
        isBomb = false;
        neighboringBombs = 0;
    }

    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }

    public int getNeighboringBombs() {
        return neighboringBombs;
    }

    public void setNeighboringBombs(int neighboringBombs) {
        this.neighboringBombs = neighboringBombs;
    }

}
