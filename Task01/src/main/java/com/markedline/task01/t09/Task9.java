package com.markedline.task01.t09;

public class Task9 {

    public static double findLength(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public static double findSquare(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public static class Circle {
        private double radius;

        Circle() {
        }

        Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
    }
}
