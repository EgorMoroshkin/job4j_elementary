package ru.job4j.array;

public class Symmetry {

    public static boolean check(int i) {
        boolean rsl = true;
        String symm = Integer.toString(i);
        for (int j = 0; j < symm.length() / 2; j++) {
            rsl = symm.charAt(j) == symm.charAt(symm.length() - 1 - j);
        }
        return rsl;
    }
}
