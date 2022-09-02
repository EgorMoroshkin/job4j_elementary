package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        String init = fio[0] + " ";
        for (int i = 1; i < fio.length; i++) {
            init += fio[i].toString().charAt(0) + ".";
        }
        return init;
    }
}
