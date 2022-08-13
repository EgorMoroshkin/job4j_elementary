package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            if (i == 0) {
                result = 1;
            } else {
                result *= i;
            }
        }
        return result;
    }
}
