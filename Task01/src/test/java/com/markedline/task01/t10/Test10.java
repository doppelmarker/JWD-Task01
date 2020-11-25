package com.markedline.task01.t10;

import org.junit.Assert;
import org.junit.Test;

public class Test10 {
    private final double DELTA = 0.00001;

    @Test
    public void findTangentSolution01() {
        double a = 1, b = 2, h = 0.1;
        double[] actual;
        double[] expected = new double[]{1.55741, 1.96476, 2.57215, 3.60210, 5.79788, 14.10142, -34.23253, -7.69660, -4.28626, -2.92710};

        actual = Task10.getResults(a, b, h, Task10::tangent);

        Assert.assertArrayEquals(expected, actual, DELTA);
    }

    @Test
    public void findTangentSolution02() {
        double a = 1, b = 2, h = 0;
        double[] actual;
        double[] expected = new double[0];

        actual = Task10.getResults(a, b, h, Task10::tangent);

        Assert.assertArrayEquals(expected, actual, DELTA);
    }

    @Test
    public void findTangentSolution03() {
        double a = 3, b = 2, h = 0.1;
        double[] actual;
        double[] expected = new double[0];

        actual = Task10.getResults(a, b, h, Task10::tangent);

        Assert.assertArrayEquals(expected, actual, DELTA);
    }
}
