package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] newArray = new int[right.length + 1];
        for (int i = 0; i < 1; i++) {
            newArray[0] = left[0];
            newArray[right.length] = left[left.length - 1];
        }
        for (int i = 1; i < middle.length; i++) {
            if (i % 2 != 0) {
                newArray[i + 1] = middle[i];
            }
        }
        for (int i = 0; i < right.length - 1; i++) {
            if (i % 2 == 0) {
                newArray[i + 1] = right[i];
            }
        }
        return newArray;
    }
}
