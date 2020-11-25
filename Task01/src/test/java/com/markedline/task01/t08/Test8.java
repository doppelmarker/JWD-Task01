package com.markedline.task01.t08;

import org.junit.Assert;
import org.junit.Test;

public class Test8 {
    private final double DELTA = 0.00000001;

    @Test
    public void findFunctionSolution01() {
        double arg = (3 + 3 * Math.sqrt(5)) / 2;

        double actual;
        double expected = 0;

        actual = Task8.function(arg);

        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void findFunctionSolution02() {
        double arg = 1;

        double actual;
        double expected = -0.2;

        actual = Task8.function(arg);

        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void findFunctionSolution03() {
        double arg = 3;

        double actual;
        double expected = 9;

        actual = Task8.function(arg);

        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void findFunctionSolution04() {
        double arg = 3;

        double actual;
        double expected = 9;

        actual = Task8.function(arg);

        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void findFunctionSolution05() {
        double arg = 2.5;

        double actual;
        double expected = 0.1038961;

        actual = Task8.function(arg);

        Assert.assertEquals(expected, actual, DELTA);
    }
}
