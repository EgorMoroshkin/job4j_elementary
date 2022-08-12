package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumFrom1To11() {
        int start = 1;
        int finish = 11;
        int expected = 66;
        int outCounter = Counter.sum(start, finish);
        assertThat(outCounter).isEqualTo(expected);
    }

    @Test
    public void sumFrom11To21() {
        int start = 11;
        int finish = 21;
        int expected = 176;
        int outCounter = Counter.sum(start, finish);
        assertThat(outCounter).isEqualTo(expected);
    }

    @Test
    public void sumHonestFrom0To10() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int outCounter = Counter.sumByEven(start, finish);
        assertThat(outCounter).isEqualTo(expected);
    }
}