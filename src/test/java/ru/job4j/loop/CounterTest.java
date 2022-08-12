package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumFrom1To10() {
        int start = 1;
        int finish = 10;
        int expected = 55;
        int outCounter = Counter.sum(start, finish);
        Assert.assertEquals(expected, outCounter);
    }

    @Test
    public void sumFrom10To20() {
        int start = 10;
        int finish = 20;
        int expected = 165;
        int outCounter = Counter.sum(start, finish);
        Assert.assertEquals(expected, outCounter);
    }
}