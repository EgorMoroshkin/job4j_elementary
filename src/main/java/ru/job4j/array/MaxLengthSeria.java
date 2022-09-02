package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                count++;
            } else {
                count = 1;
            }
        }
        return count;
    }
}
