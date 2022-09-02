package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int len = data.length * data[0].length;
        int temp = 0;
        int[] newData = new int[data.length * data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (temp < len) {
                    newData[temp] = data[i][j];
                    temp++;
                }
            }
        } return newData;
    }
}
