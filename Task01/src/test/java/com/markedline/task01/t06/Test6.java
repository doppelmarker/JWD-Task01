package com.markedline.task01.t06;

import org.junit.Assert;
import org.junit.Test;

public class Test6 {
    @Test
    public void findHoursMinutesSeconds01() {
        int seconds = 6;

        int actualHrs, actualMins, actualSecs;
        int expectedHrs = 0, expectedMins = 0, expectedSecs = 6;

        actualHrs = Task6.findHours(seconds);
        actualMins = Task6.findMinutes(seconds);
        actualSecs = Task6.findSeconds(seconds);

        Assert.assertEquals(expectedHrs, actualHrs);
        Assert.assertEquals(expectedMins, actualMins);
        Assert.assertEquals(expectedSecs, actualSecs);
    }

    @Test
    public void findHoursMinutesSeconds02() {
        int seconds = 321;

        int actualHrs, actualMins, actualSecs;
        int expectedHrs = 0, expectedMins = 5, expectedSecs = 21;

        actualHrs = Task6.findHours(seconds);
        actualMins = Task6.findMinutes(seconds);
        actualSecs = Task6.findSeconds(seconds);

        Assert.assertEquals(expectedHrs, actualHrs);
        Assert.assertEquals(expectedMins, actualMins);
        Assert.assertEquals(expectedSecs, actualSecs);
    }

    @Test
    public void findHoursMinutesSeconds03() {
        int seconds = 3600;

        int actualHrs, actualMins, actualSecs;
        int expectedHrs = 1, expectedMins = 0, expectedSecs = 0;

        actualHrs = Task6.findHours(seconds);
        actualMins = Task6.findMinutes(seconds);
        actualSecs = Task6.findSeconds(seconds);

        Assert.assertEquals(expectedHrs, actualHrs);
        Assert.assertEquals(expectedMins, actualMins);
        Assert.assertEquals(expectedSecs, actualSecs);
    }

    @Test
    public void findHoursMinutesSeconds04() {
        int seconds = 5000;

        int actualHrs, actualMins, actualSecs;
        int expectedHrs = 1, expectedMins = 23, expectedSecs = 20;

        actualHrs = Task6.findHours(seconds);
        actualMins = Task6.findMinutes(seconds);
        actualSecs = Task6.findSeconds(seconds);

        Assert.assertEquals(expectedHrs, actualHrs);
        Assert.assertEquals(expectedMins, actualMins);
        Assert.assertEquals(expectedSecs, actualSecs);
    }

    @Test
    public void findHoursMinutesSeconds05() {
        int seconds = 0;

        int actualHrs, actualMins, actualSecs;
        int expectedHrs = 0, expectedMins = 0, expectedSecs = 0;

        actualHrs = Task6.findHours(seconds);
        actualMins = Task6.findMinutes(seconds);
        actualSecs = Task6.findSeconds(seconds);

        Assert.assertEquals(expectedHrs, actualHrs);
        Assert.assertEquals(expectedMins, actualMins);
        Assert.assertEquals(expectedSecs, actualSecs);
    }
}
