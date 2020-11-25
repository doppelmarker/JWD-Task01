package com.markedline.task01.t01;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {

    @Test
    public void findLastDigitOfSquareTest01() {
        int num = 144;

        int actual;
        int expected = 6;

        actual = Task1.findLastDigitOfSquare(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findLastDigitOfSquareTest02() {
        int num = 155;

        int actual;
        int expected = 5;

        actual = Task1.findLastDigitOfSquare(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findLastDigitOfSquareTest03() {
        int num = 288;

        int actual;
        int expected = 4;

        actual = Task1.findLastDigitOfSquare(num);

        Assert.assertEquals(expected, actual);
    }
}
