package com.markedline.task01.t05;

public class Task5 {

    public static boolean isNumberPerfect(long num) {
        if (num == 0) return false;

        long sum = 0;

        for (long d = num / 2; d >= 1; --d) {
            if (num % d == 0)
                sum += d;
        }
        return sum == num;
    }
}
