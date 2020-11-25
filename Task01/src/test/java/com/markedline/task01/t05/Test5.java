package com.markedline.task01.t05;

import org.junit.Assert;
import org.junit.Test;

public class Test5 {
    @Test
    public void isNumberPerfect01() {
        long num = 6;

        boolean actual;
        boolean expected = true;

        actual = Task5.isNumberPerfect(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberPerfect02() {
        long num = 28;

        boolean actual;
        boolean expected = true;

        actual = Task5.isNumberPerfect(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberPerfect03() {
        long num = 496;

        boolean actual;
        boolean expected = true;

        actual = Task5.isNumberPerfect(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberPerfect04() {
        long num = 8128;

        boolean actual;
        boolean expected = true;

        actual = Task5.isNumberPerfect(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberPerfect05() {
        long num = 33550336;

        boolean actual;
        boolean expected = true;

        actual = Task5.isNumberPerfect(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberPerfect06() {
        long num = 33550337;

        boolean actual;
        boolean expected = false;

        actual = Task5.isNumberPerfect(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberPerfect07() {
        long num = 0;

        boolean actual;
        boolean expected = false;

        actual = Task5.isNumberPerfect(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberPerfect08() {
        long num = 1;

        boolean actual;
        boolean expected = false;

        actual = Task5.isNumberPerfect(num);

        Assert.assertEquals(expected, actual);
    }
}
