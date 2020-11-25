package com.markedline.task01.t04;

import org.junit.Assert;
import org.junit.Test;

public class Test4 {
    @Test
    public void trueOrFalse01() {
        int a = 1, b = 2, c = 3, d = 4;

        boolean actual;
        boolean expected = true;

        actual = Task4.trueOrFalse(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trueOrFalse02() {
        int a = 0, b = 11, c = 3, d = 0;

        boolean actual;
        boolean expected = true;

        actual = Task4.trueOrFalse(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trueOrFalse03() {
        int a = 1, b = 11, c = 3, d = 2;

        boolean actual;
        boolean expected = false;

        actual = Task4.trueOrFalse(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trueOrFalse04() {
        int a = 1, b = 7, c = 3, d = 5;

        boolean actual;
        boolean expected = false;

        actual = Task4.trueOrFalse(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trueOrFalse05() {
        int a = 0, b = 0, c = 0, d = 0;

        boolean actual;
        boolean expected = true;

        actual = Task4.trueOrFalse(a, b, c, d);

        Assert.assertEquals(expected, actual);
    }
}
