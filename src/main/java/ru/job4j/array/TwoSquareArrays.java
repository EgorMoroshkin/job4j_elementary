package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] newArray = new int[left.length * left[0].length];
        int temp = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[0].length; j++) {
                if (left[i][j] > right[i][j]) {
                    newArray[temp] = left[i][j];
                    temp++;
                } else {
                    newArray[temp] = right[i][j];
                    temp++;
                }
            }
        }
        return newArray;
    }
}
