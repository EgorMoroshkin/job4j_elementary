package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int index = 0;

        int[] newArray = new int[data.length * data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != sum) {
                    newArray[index] = data[i][j];
                    index++;
                }
            }
        }
        return Arrays.copyOf(newArray, index);
    }
}
