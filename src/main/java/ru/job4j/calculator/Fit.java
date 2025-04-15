package ru.job4j.calculator;

public class Fit {
    public static void main(String[] args) {
        short height = 187;
        System.out.printf("Man 187 is %.2f%n", idealWeight(height, Gender.MALE));
        System.out.printf("Woman 187 is %.2f%n", idealWeight(height, Gender.FEMALE));
    }

    public enum Gender {
        MALE, FEMALE
    }

    public static double idealWeight(short height, Gender gender) {
        if (height < 100) {
            throw new IllegalArgumentException("Height must be >= 100 cm");
        }
        int base = gender == Gender.MALE ? 100 : 110;
        return (height - base) * 1.15;
    }
}
