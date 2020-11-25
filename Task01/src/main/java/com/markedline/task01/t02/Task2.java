package com.markedline.task01.t02;

public class Task2 {

    public static int findDaysAmount(int year, int monthNumber) {
        boolean isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        return switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeap ? 29 : 28;
            default -> 0;
        };
    }
}
