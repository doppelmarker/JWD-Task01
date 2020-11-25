package com.markedline.task01.t07;

import java.util.Objects;

public class Task7 {
    public static void main(String[] args) {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(4, 2);
        System.out.println(getCloserPoint(point1, point2));
    }

    public static double getDistance(Point point) {
        return Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
    }

    public static Point getCloserPoint(Point point1, Point point2) {
        return getDistance(point1) < getDistance(point2) ? point1 : point2;
    }

    public static class Point {
        private double x;
        private double y;

        Point() {
        }

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
