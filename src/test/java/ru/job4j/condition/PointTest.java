package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when26to46then2Dot82() {
        double expected = 2.82;
        Point a = new Point(2, 6);
        Point b = new Point(4, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when69to34then5Dot83() {
        double expected = 5.83;
        Point a = new Point(6, 9);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when62to87then5Dot38() {
        double expected = 5.38;
        Point a = new Point(6, 2);
        Point b = new Point(8, 7);
        double out = a.distance(b);

        Assert.assertEquals(expected, out, 0.01);
    }
}