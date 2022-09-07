package ru.job4j.condition;

public class Max {
    private int first;
    private int second;
    private int third;
    private int fourth;

    public static int max(int first, int second, int third) {
        return Math.max(first, Math.max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return Math.max(first, Math.max(second, Math.max(third, fourth)));
    }
}
