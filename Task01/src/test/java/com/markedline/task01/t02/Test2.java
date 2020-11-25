package com.markedline.task01.t02;

import org.junit.Assert;
import org.junit.Test;

public class Test2 {
    @Test
    public void findDaysAmount01() {
        int year = 2016, monthNumber = 2;

        int actual;
        int expected = 29;

        actual = Task2.findDaysAmount(year, monthNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findDaysAmount02() {
        int year = 2020, monthNumber = 2;

        int actual;
        int expected = 29;

        actual = Task2.findDaysAmount(year, monthNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findDaysAmount03() {
        int year = 2020, monthNumber = 11;

        int actual;
        int expected = 30;

        actual = Task2.findDaysAmount(year, monthNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findDaysAmount04() {
        int year = 2020, monthNumber = 0;

        int actual;
        int expected = 0;

        actual = Task2.findDaysAmount(year, monthNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findDaysAmount05() {
        int year = 100, monthNumber = 2;

        int actual;
        int expected = 28;

        actual = Task2.findDaysAmount(year, monthNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findDaysAmount06() {
        int year = 400, monthNumber = 2;

        int actual;
        int expected = 29;

        actual = Task2.findDaysAmount(year, monthNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findDaysAmount07() {
        int year = 400, monthNumber = 2;

        int actual;
        int expected = 29;

        actual = Task2.findDaysAmount(year, monthNumber);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findDaysAmount08() {
        int year = 400, monthNumber = 12;

        int actual;
        int expected = 31;

        actual = Task2.findDaysAmount(year, monthNumber);

        Assert.assertEquals(expected, actual);
    }
}
