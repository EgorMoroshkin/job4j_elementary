package ru.job4j.condition;

public class Point {
    public static void main(String[] args) {
        double resultOne = Point.distance(5, 6, 10, 15);
        double resultTwo = Point.distance(2, 2, 8, 8);
        System.out.println("result (5, 6) to (10, 15) " + resultOne);
        System.out.println("result (2, 2) to (8, 8) " + resultTwo);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
