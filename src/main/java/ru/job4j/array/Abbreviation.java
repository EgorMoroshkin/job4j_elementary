package ru.job4j.array;

public class Abbreviation {
    public static String collect(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) >= 65 && s.codePointAt(i) <= 90) {
                str += s.charAt(i);
            }
        }
        return str;
    }
}
