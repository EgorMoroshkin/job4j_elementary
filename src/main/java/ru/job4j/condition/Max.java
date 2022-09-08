package ru.job4j.condition;

public class Max {
    public static int max(int left, int second) {
        return left > second ? left : second;
    }

    public static int max(int first, int second, int third) {
        return Math.max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return Math.max(max(first, second), max(third, fourth));
    }
}
