package ru.job4j.array;

public class SummingPrevious {
    public static void main(String[] args) {
        System.out.println(SummingPrevious.calculate(1, 2, 6));
    }

    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        int sum = a + b;
        rsl[0] = a;
        rsl[1] = b;
        for (int i = 2; i < n; i++) {
            rsl[i] = sum;
            sum += rsl[i];
        }
        return rsl;
    }
}
