package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int len = data.length;
        int temp = 0;
        int[] newData = new int[len];
        for (int i = 0; i < data.length; i++) {
            for (int j = data[i].length - 1 - i; j >= 0; j--) {
                if (temp < len) {
                    newData[temp] = data[i][j];
                    temp++;
                    break;
                }
            }
        } return newData;
    }
}
