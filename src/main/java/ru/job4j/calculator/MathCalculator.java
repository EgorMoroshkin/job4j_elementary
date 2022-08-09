package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static void main(String[] args) {
        System.out.println("Результат расчета №1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета №2 равен: " + diffAndDivision(10, 20));
        System.out.println("Результат расчета №2 равен: " + sumAndMultAndDiffAndDivision(10, 20));
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumAndMultAndDiffAndDivision(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + difference(first, second)
                + division(first, second);
    }
}
