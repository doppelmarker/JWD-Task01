package com.markedline.task01.t03;

public class Task3 {

    public static double findInscribedSquareArea(double squareArea) {
        double a1 = Math.sqrt(squareArea);
        double circleRadius = a1 / 2.;
        double a2 = circleRadius * Math.sqrt(2);
        return a2 * a2;
    }

    public static double findTimesDifference(double squareArea, double inscribedSquareArea) {
        if (squareArea == 0 || inscribedSquareArea == 0)
            return 0;
        return squareArea / inscribedSquareArea;
    }
}
