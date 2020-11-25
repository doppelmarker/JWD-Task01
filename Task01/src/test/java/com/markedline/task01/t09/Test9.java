package com.markedline.task01.t09;

import org.junit.Assert;
import org.junit.Test;

public class Test9 {
    private final double DELTA = 0.001;

    @Test
    public void findLengthAndSquare01() {
        double radius = 1;

        double actualLength, actualArea;
        double expectedLength = 6.283, expectedArea = 3.142;

        Task9.Circle circle = new Task9.Circle(radius);

        actualLength = Task9.findLength(circle);
        actualArea = Task9.findSquare(circle);

        Assert.assertEquals(expectedLength, actualLength, DELTA);
        Assert.assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void findLengthAndSquare02() {
        double radius = 2;

        double actualLength, actualArea;
        double expectedLength = 12.566, expectedArea = 12.566;

        Task9.Circle circle = new Task9.Circle(radius);

        actualLength = Task9.findLength(circle);
        actualArea = Task9.findSquare(circle);

        Assert.assertEquals(expectedLength, actualLength, DELTA);
        Assert.assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void findLengthAndSquare03() {
        double radius = 0;

        double actualLength, actualArea;
        double expectedLength = 0, expectedArea = 0;

        Task9.Circle circle = new Task9.Circle(radius);

        actualLength = Task9.findLength(circle);
        actualArea = Task9.findSquare(circle);

        Assert.assertEquals(expectedLength, actualLength, DELTA);
        Assert.assertEquals(expectedArea, actualArea, DELTA);
    }
}
