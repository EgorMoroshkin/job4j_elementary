package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println();
        String[] names = new String[5];
        names[0] = "Egor";
        names[1] = "Dmitriy";
        names[2] = "Ivan";
        names[3] = "Oleg";
        names[4] = "Stepan";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
