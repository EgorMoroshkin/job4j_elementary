package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int temp = 2;
        if (array.length / temp > temp) {
            temp++;
        }
        int row = 0;
        int cell = 0;
        int[][] newArray = new int[temp][temp];
        for (int i = 0; i < array.length; i++) {
            if (cell < temp) {
                newArray[row][cell] = array[i];
                cell++;
            } else {
                cell = 0;
                row++;
                i--;
            }

        }
        return newArray;
    }
}
