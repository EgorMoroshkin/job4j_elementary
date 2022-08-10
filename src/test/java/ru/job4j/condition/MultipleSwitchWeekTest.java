package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void dayMonday() {
        String day = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void daySaturday() {
        String day = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}