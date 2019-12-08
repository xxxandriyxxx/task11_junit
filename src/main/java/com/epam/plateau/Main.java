package com.epam.plateau;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {5, 5, 4, 2, 3, 3, 3, 3, 3, 1, 2};
        Plateau plateau = new Plateau(values);
        System.out.println("Array: " + Arrays.toString(plateau.getArray()));
        System.out.println("Longest com.epam.plateau: " + Arrays.toString(plateau.getLongestPlateau()));
        System.out.println("Longest com.epam.plateau location: " + Arrays.toString(plateau.getLongestPlateauLocation()));
        System.out.println("Longest com.epam.plateau length: " + plateau.getLongestPlateauLength());
    }
}
