package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        int len = string.length;
        char[] newStr = new char[len];
        int temp = 0;
        String str = new String(string);
        for (int i = 0; i < str.length(); i++) {
            char tempChar = str.charAt(i);
            if (Character.isLowerCase(tempChar)) {
                System.out.println(tempChar);
                if (temp < len) {
                    newStr[temp] = Character.toUpperCase(str.charAt(i));

                    temp++;
                }
            } else {
                System.out.println(tempChar);
                newStr[temp] = Character.toUpperCase(str.charAt(i));
                temp++;
            }
        } return newStr;
    }
}
