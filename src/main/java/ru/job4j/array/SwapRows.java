package ru.job4j.array;

import java.util.Arrays;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int temp  = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < data[i].length; j++) {
                temp = data[dst][j];
                data[dst][j] = data[src][j];
                data[src][j] = temp;

            }
        }
    }
}
