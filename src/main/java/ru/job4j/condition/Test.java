package ru.job4j.condition;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(max(a, b, c));

    }

    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        }
        if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}
