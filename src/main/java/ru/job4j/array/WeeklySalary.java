package ru.job4j.array;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        int normWeekday;
        int normWeekend;

        for (int i = 0; i < hours.length; i++) {
            if ((i == 5 || i == 6) && hours[i] > 0) {
                if (hours[i] <= 8) {
                    sum += hours[i] * 20;
                } else {
                    normWeekend = hours[i] - 8;
                    sum += 8 * 20 + normWeekend * 30;
                }
            } else if (hours[i] >= 8) {
                normWeekday = hours[i] - 8;
                sum += 8 * 10 + normWeekday * 15;
            }

        }
        return sum;
    }
}
