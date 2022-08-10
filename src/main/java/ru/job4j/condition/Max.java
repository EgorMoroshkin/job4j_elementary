package ru.job4j.condition;

public class Max {
    public static void main(String[] args) {
        max(1, 2);
        max(4, 1);
        max(3, 3);
    }

    public static int max(int left, int right) {
        return left > right ? left : right;
    }
}
