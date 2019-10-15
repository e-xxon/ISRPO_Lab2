package com.company;

import org.junit.Assert;
import org.junit.Test;

public class PolynomialTest {

    @Test
    public void findValue() {
        int num = 1;
        Polynomial pol = new Polynomial();
        pol.add(5, 6);
        pol.add(8,7);
        Polynomial pol2 = new Polynomial();
        pol2.add(8,7);
        pol2.add(7,6);
        Polynomial pol3 = pol.concatenate(pol, pol2);
        int expected = 3;
        int actual = pol3.findValue(num);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString() {
        Polynomial pol = new Polynomial();
        pol.add(5, 6);
        pol.add(8,7);
        Polynomial pol2 = new Polynomial();
        pol2.add(8,7);
        pol2.add(7,6);
        Polynomial pol3 = pol.concatenate(pol, pol2);
        String expected = "83/42+97/42x^1";
        String actual = pol3.toString();
        Assert.assertEquals(expected, actual);
    }
}