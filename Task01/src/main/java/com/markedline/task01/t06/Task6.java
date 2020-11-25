package com.markedline.task01.t06;

public class Task6 {

    public static int findHours(int seconds) {
        return seconds / 3600;
    }

    public static int findMinutes(int seconds) {
        return (seconds - findHours(seconds) * 3600) / 60;
    }

    public static int findSeconds(int seconds) {
        return seconds - (findHours(seconds) * 3600 + findMinutes(seconds) * 60);
    }
}
