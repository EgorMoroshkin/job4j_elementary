package ru.job4j.condition;

public class SqArea {
    public static void main(String[] args) {
        double resultOne = SqArea.square(6, 2);
        double resultTwo = SqArea.square(4, 1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + resultOne);
        System.out.println(" p = 4, k = 1, s = 1, real = " + resultTwo);
    }

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }
}
