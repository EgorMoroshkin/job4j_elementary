package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2To3Then3() {
        int result = Max.max(1, 2, 3);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To7To9To1Then9() {
        int result = Max.max(3, 7, 9, 1);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}