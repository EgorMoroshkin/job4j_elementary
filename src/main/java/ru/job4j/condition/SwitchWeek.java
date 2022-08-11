package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        switch (day) {
            case 7:
                return "Воскресенье";
            case 6:
                return "Суббота";
            case 5:
                return "Пятница";
            case 4:
                return "Четверг";
            case 3:
                return "Среда";
            case 2:
                return "Вторник";
            case 1:
                return "Понедельник";
            default:
                return "Ошибка";
        }
    }
}
