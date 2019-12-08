package com.epam.plateau;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PlateauTestWithRunner {
    @Parameterized.Parameter(0)
    public int longestPlateauLength;
    @Parameterized.Parameter(1)
    public int longestPlateauStartIndex;
    @Parameterized.Parameter(2)
    public int longestPlateauEndIndex;

    @Test
    public void testLongestPlateauLength() {
        int[] values = {5, 5, 4, 2, 3, 3, 3, 3, 3, 1, 2};
        Plateau plateau = new Plateau(values);
        assert (plateau.getLongestPlateau().length == longestPlateauLength);
    }

    @Test
    public void testLongestPlateauStart() {
        int[] values = {5, 5, 4, 2, 3, 3, 3, 3, 3, 1, 2};
        Plateau plateau = new Plateau(values);
        assert (plateau.getLongestPlateauLocation()[0] == longestPlateauStartIndex);
    }

    @Test
    public void testLongestPlateauEnd() {
        int[] values = {5, 5, 4, 2, 3, 3, 3, 3, 3, 1, 2};
        Plateau plateau = new Plateau(values);
        assert (plateau.getLongestPlateauLocation()[plateau.getLongestPlateauLocation().length - 1]
                == longestPlateauEndIndex);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{
                {3, 2, 4}, {5, 6, 10}, {7, 3, 9}
        });
    }

}
