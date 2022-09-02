package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        String str = Integer.toString(number);
        int j = 0;
        char[] chars = new char[str.length()];
        int[] array = new int[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            chars[j] = str.charAt(i);
            array[j] = Character.getNumericValue(chars[j]);
            j++;
        }
        return array;
    }
}
