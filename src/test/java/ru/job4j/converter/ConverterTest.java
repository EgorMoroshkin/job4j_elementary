package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        float eps = 0.0001f;
        Assert.assertEquals(expectedEuro, outEuro, eps);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        float inDollar = 180;
        float expectedDollar = 3;
        float outDollar = Converter.rubleToDollar(inDollar);
        float eps = 0.0001f;
        Assert.assertEquals(expectedDollar, outDollar, eps);
    }
}