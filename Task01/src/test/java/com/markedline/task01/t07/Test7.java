package com.markedline.task01.t07;

import org.junit.Assert;
import org.junit.Test;

public class Test7 {
    @Test
    public void findCloserPoint01() {
        Task7.Point point1 = new Task7.Point(2, 2);
        Task7.Point point2 = new Task7.Point(4, 2);
        Task7.Point actualPoint;
        Task7.Point expectedPoint = point1;

        actualPoint = Task7.getCloserPoint(point1, point2);

        Assert.assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void findCloserPoint02() {
        Task7.Point point1 = new Task7.Point(10, 20);
        Task7.Point point2 = new Task7.Point(11, 19);
        Task7.Point actualPoint;
        Task7.Point expectedPoint = point2;

        actualPoint = Task7.getCloserPoint(point1, point2);

        Assert.assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void findCloserPoint03() {
        Task7.Point point1 = new Task7.Point(-11, -19);
        Task7.Point point2 = new Task7.Point(11, 19);
        Task7.Point actualPoint;
        Task7.Point expectedPoint = point2;

        actualPoint = Task7.getCloserPoint(point1, point2);

        Assert.assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void findCloserPoint04() {
        Task7.Point point1 = new Task7.Point(0, 0);
        Task7.Point point2 = new Task7.Point(0, 0);
        Task7.Point actualPoint;
        Task7.Point expectedPoint = point1;

        actualPoint = Task7.getCloserPoint(point1, point2);

        Assert.assertEquals(expectedPoint, actualPoint);
    }

    @Test
    public void findCloserPoint05() {
        Task7.Point point1 = new Task7.Point(0, 0);
        Task7.Point point2 = new Task7.Point(0, 0);
        Task7.Point actualPoint;
        Task7.Point expectedPoint = point2;

        actualPoint = Task7.getCloserPoint(point1, point2);

        Assert.assertEquals(expectedPoint, actualPoint);
    }
}
