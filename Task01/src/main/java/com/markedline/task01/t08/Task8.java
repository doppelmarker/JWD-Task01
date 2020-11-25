package com.markedline.task01.t08;

public class Task8 {

    public static double function(double x) {
        return x >= 3 ? -Math.pow(x, 2) + 3 * x + 9 : 1 / (Math.pow(x, 3) - 6);
    }
}
