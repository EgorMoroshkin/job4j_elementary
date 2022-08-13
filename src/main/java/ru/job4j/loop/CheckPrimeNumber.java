package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
