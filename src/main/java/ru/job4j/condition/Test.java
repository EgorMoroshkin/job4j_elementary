package ru.job4j.condition;

public class Test {
    public static void main(String[] args) {
        int a = 2019;
        int b = 1800;
        int c = 2020;
        int d = 2000;


        System.out.println(LeapYear.checkYear(a));
        System.out.println(LeapYear.checkYear(b));
        System.out.println(LeapYear.checkYear(c));
        System.out.println(LeapYear.checkYear(d));


    }

    public class LeapYear {

        public static boolean checkYear(int year) {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if (year % 100 == 0 && year % 400 == 0) {
                return true;
            }
            return false;
        }

    }
}

