package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int j = 0;
        int[] newData = new int[data.length];
        for (int datum : data) {
            if (datum % 2 != 0) {
                newData[j] = datum;
                j++;
            }
        }
        newData = Arrays.copyOf(newData, j);
        return  newData;
    }
}
