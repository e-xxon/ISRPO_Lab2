package com.company;

import org.junit.Assert;
import org.junit.Test;

public class FractionTest {

    @Test
    public void value() {
        Fraction fr = new Fraction(3, 4);
        int expected = 3/4;
        int actual = fr.Value();
        Assert.assertEquals(expected, actual);
    }
}