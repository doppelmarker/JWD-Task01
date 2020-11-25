package com.markedline.task01.t01;

public class Task1 {
    public static int findLastDigitOfSquare(int num) {
        int lastDigit = num % 10;
        return (lastDigit * lastDigit) % 10;
    }
}
