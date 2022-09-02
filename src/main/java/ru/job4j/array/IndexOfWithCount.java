package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int count = 0;
        String str;
        str = string.toString();
        int temp = -1;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                count++;
                temp = i;
                if (count >= number) {
                    break;
                }
            }

        }
        return temp;

    }
}
