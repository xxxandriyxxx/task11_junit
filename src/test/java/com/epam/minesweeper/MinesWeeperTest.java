package com.epam.minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinesWeeperTest {

    @Test
    public void createBoard() {
        Board board = new Board(10, 20, 10);
        int bombAmount = 0;
        int amount = 10;
        for (int i = 0; i < board.getSizeH(); i++) {
            for (int j = 0; j < board.getSizeV(); j++) {
                if (board.getCells()[i][j].isBomb()) {
                    bombAmount++;
                }
            }
        }
//        these values will not always be equal
        assertEquals(bombAmount, amount);
    }
}
