package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        return switch (day) {
            case 7 -> "Воскресенье";
            case 6 -> "Суббота";
            case 5 -> "Пятница";
            case 4 -> "Четверг";
            case 3 -> "Среда";
            case 2 -> "Вторник";
            case 1 -> "Понедельник";
            default -> "Ошибка";
        };
    }
}
