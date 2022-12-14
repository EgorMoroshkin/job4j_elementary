package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int num = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[1 + i];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = num;
                num++;
            }
        }
        return triangle;
    }
}