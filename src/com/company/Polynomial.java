package com.company;

public class Polynomial extends SetOfFractions
{
    int findValue(int x)
    {
        int value = 0;
        for (int i = 0; i < fractions.size(); i++)
        {
            value += fractions.get(i).Value() * Math.pow(x, i);
        }
        return value;
    }

    Polynomial concatenate(Polynomial first, Polynomial second)
    {
        Polynomial newPolynomial = new Polynomial();
        int count;
        if (first.fractions.size() > second.fractions.size())
        {
            for (int i = 0; i < second.fractions.size(); i++)
            {
                newPolynomial.addFraction(new Fraction(first.fractions.get(i).getUp() * second.fractions.get(i).getDown() + first.fractions.get(i).getDown() * second.fractions.get(i).getUp(), (first.fractions.get(i).getDown() * second.fractions.get(i).getDown())));
            }
            count = second.fractions.size();
            while (count != first.fractions.size())
            {
                newPolynomial.addFraction(first.fractions.get(count));
                count++;
            }
        }
        else
        {
            for (int i = 0; i < first.fractions.size(); i++)
            {
                newPolynomial.addFraction(new Fraction(first.fractions.get(i).getUp() * second.fractions.get(i).getDown() + first.fractions.get(i).getDown() * second.fractions.get(i).getUp(), (first.fractions.get(i).getDown() * second.fractions.get(i).getDown())));
            }
            count = first.fractions.size();
            while (count != second.fractions.size())
            {
                newPolynomial.addFraction(second.fractions.get(count));
                count++;
            }
        }
        return newPolynomial;
    }

    @Override
    public String toString()
    {
        if (fractions.size() == 0)
        {
            try
            {
                throw new Exception();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        String buffer = fractions.get(0).toString();
        for (int i = 1; i < fractions.size(); i++)
        {
            buffer += "+" + fractions.get(i).toString() + "x^" + i;
        }
        return buffer;
    }
}
