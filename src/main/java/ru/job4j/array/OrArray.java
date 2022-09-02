package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] newArray = new int[left.length + right.length];
        int k = 0;
        for (int i = 0; i < left.length; i++) {
            newArray[i] = left[i];
            k++;
        }
        for (int j = 0; j < right.length; j++) {
            if (newArray[j] != right[j]) {
                newArray[k] = right[j];
                k++;
            }
        }
        newArray = Arrays.copyOf(newArray, k);
        return newArray;
    }
}
