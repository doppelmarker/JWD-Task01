package com.markedline.task01.t03;

import org.junit.Assert;
import org.junit.Test;

public class Test3 {
    private final double DELTA = 0.00000001;
    private final double EXPECTED_TIMES_DIFFERENCE = 2;
    private final double EXPECTED_TIMES_DIFFERENCE_ZERO = 0;

    @Test
    public void findInscribedSquareArea01() {
        double squareArea = 4;
        double actualInscribedSquareArea, actualTimesDifference;
        double expectedInscribedSquareArea = 2;

        actualInscribedSquareArea = Task3.findInscribedSquareArea(squareArea);
        actualTimesDifference = Task3.findTimesDifference(squareArea, actualInscribedSquareArea);

        Assert.assertEquals(expectedInscribedSquareArea, actualInscribedSquareArea, DELTA);
        Assert.assertEquals(EXPECTED_TIMES_DIFFERENCE, actualTimesDifference, DELTA);
    }

    @Test
    public void findInscribedSquareArea02() {
        double squareArea = 8;
        double actualInscribedSquareArea, actualTimesDifference;
        double expectedInscribedSquareArea = 4;

        actualInscribedSquareArea = Task3.findInscribedSquareArea(squareArea);
        actualTimesDifference = Task3.findTimesDifference(squareArea, actualInscribedSquareArea);

        Assert.assertEquals(expectedInscribedSquareArea, actualInscribedSquareArea, DELTA);
        Assert.assertEquals(EXPECTED_TIMES_DIFFERENCE, actualTimesDifference, DELTA);
    }

    @Test
    public void findInscribedSquareArea03() {
        double squareArea = 8.5;
        double actualInscribedSquareArea, actualTimesDifference;
        double expectedInscribedSquareArea = 4.25;

        actualInscribedSquareArea = Task3.findInscribedSquareArea(squareArea);
        actualTimesDifference = Task3.findTimesDifference(squareArea, actualInscribedSquareArea);

        Assert.assertEquals(expectedInscribedSquareArea, actualInscribedSquareArea, DELTA);
        Assert.assertEquals(EXPECTED_TIMES_DIFFERENCE, actualTimesDifference, DELTA);
    }

    @Test
    public void findInscribedSquareArea04() {
        double squareArea = 20;
        double actualInscribedSquareArea, actualTimesDifference;
        double expectedInscribedSquareArea = 10;

        actualInscribedSquareArea = Task3.findInscribedSquareArea(squareArea);
        actualTimesDifference = Task3.findTimesDifference(squareArea, actualInscribedSquareArea);

        Assert.assertEquals(expectedInscribedSquareArea, actualInscribedSquareArea, DELTA);
        Assert.assertEquals(EXPECTED_TIMES_DIFFERENCE, actualTimesDifference, DELTA);
    }

    @Test
    public void findInscribedSquareArea05() {
        double squareArea = 4.8642;
        double actualInscribedSquareArea, actualTimesDifference;
        double expectedInscribedSquareArea = 2.4321;

        actualInscribedSquareArea = Task3.findInscribedSquareArea(squareArea);
        actualTimesDifference = Task3.findTimesDifference(squareArea, actualInscribedSquareArea);

        Assert.assertEquals(expectedInscribedSquareArea, actualInscribedSquareArea, DELTA);
        Assert.assertEquals(EXPECTED_TIMES_DIFFERENCE, actualTimesDifference, DELTA);
    }

    @Test
    public void findInscribedSquareArea06() {
        double squareArea = 0;
        double actualInscribedSquareArea, actualTimesDifference;
        double expectedInscribedSquareArea = 0;

        actualInscribedSquareArea = Task3.findInscribedSquareArea(squareArea);
        actualTimesDifference = Task3.findTimesDifference(squareArea, actualInscribedSquareArea);

        Assert.assertEquals(expectedInscribedSquareArea, actualInscribedSquareArea, DELTA);
        Assert.assertEquals(EXPECTED_TIMES_DIFFERENCE_ZERO, actualTimesDifference, DELTA);
    }
}
