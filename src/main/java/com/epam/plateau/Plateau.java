package com.epam.plateau;

public class Plateau {

    private int[] array;
    private int[] longestPlateau;
    private int longestPlateauLength;
    private int[] longestPlateauLocation;

    public Plateau(int[] array) {
        this.array = array;
        findLongestPlateau();
    }

    private void findLongestPlateau() {
        int longestPlateauLength = 0;
        int plateauStart = 0;
        int plateauEnd = 0;
        //if com.epam.plateau exists it can start anywhere between 0 and length-3. Can't exist after that
        for (int i = 0; i < array.length - 3; i++) {
            //com.epam.plateau cant start at the first 3 locations
            for (int j = i + 3; j < array.length; j++) {
                boolean isLess = false;
                boolean isMiddleHigher = true;
                //value at the end of the com.epam.plateau can be less or equal to value at the beginning
                if (array[j] <= array[i]) {
                    isLess = true;
                    //all middle values equal and higher than 1st value
                    for (int p = i + 2; p < j; p++) {
                        if ((array[p] != array[p - 1] || array[p] <= array[i])) {
                            isMiddleHigher = false;
                            break;
                        }
                    }
                }
                if (isLess && isMiddleHigher) {
                    int length = j - i;
                    if (length >= longestPlateauLength) {
                        longestPlateauLength = length;
                        plateauStart = i;
                        plateauEnd = j;
                    }
                }
            }
        }
        if (longestPlateauLength > 0) {
            longestPlateau = new int[plateauEnd - plateauStart + 1];
            longestPlateauLocation = new int[plateauEnd - plateauStart + 1];
            for (int i = plateauStart; i <= plateauEnd; i++) {
                longestPlateau[i - plateauStart] = array[i];
                longestPlateauLocation[i - plateauStart] = i;
            }
            this.longestPlateauLength = longestPlateauLength + 1;
        }
    }

    public int[] getArray() {
        return array;
    }

    public int[] getLongestPlateau() {
        return longestPlateau;
    }

    public int getLongestPlateauLength() {
        return longestPlateauLength;
    }

    public int[] getLongestPlateauLocation() {
        return longestPlateauLocation;
    }
}
