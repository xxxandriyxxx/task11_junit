package com.epam.plateau;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {

    @Test
    void testPlateau() {
        int[] values = {5, 5, 4, 2, 3, 3, 3, 3, 3, 1, 2};
        Plateau plateau = new Plateau(values);
        int[] longestPlateau = new int[]{2, 3, 3, 3, 3, 3, 1};
        assertArrayEquals(plateau.getLongestPlateau(), longestPlateau, "Longest plateaus are not equal");
    }

    @Test
    void testLength() {
        int[] values = {5, 5, 4, 2, 3, 3, 3, 3, 3, 1, 2};
        Plateau plateau = new Plateau(values);
        if (plateau.getLongestPlateau().length != 10) {
            fail("Longest plateau length != 10");
        }
    }

}
