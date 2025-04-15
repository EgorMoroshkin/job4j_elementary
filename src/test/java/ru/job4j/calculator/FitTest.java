package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenWomanHeight187ThenWeightIs8855() {
        double expected = 88.55;
        double actual = Fit.idealWeight((short) 187, Fit.Gender.FEMALE);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenHeightTooLowThenException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Fit.idealWeight((short) 90, Fit.Gender.MALE)
        );
        assertEquals("Height must be >= 100 cm", exception.getMessage());
    }
}