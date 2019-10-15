package com.company;

import java.util.ArrayList;

public class SetOfFractions
{
    public SetOfFractions()
    {
        this.fractions = new ArrayList<>();
        this.cash = new ArrayList<>();
        MaxValue = null;
        MinValue = null;
    }

    public void add(int m, int n)
    {
        Fraction newF = new Fraction(m, n);

        if (MinValue != null)
        {
            if (MinValue.greaterThen(newF)) MinValue = newF;
        }
        else
        {
            MinValue = newF;
        }

        if (MaxValue != null)
        {
            if (!MaxValue.greaterThen(newF)) MaxValue = newF;
        }
        else
        {
            MaxValue = newF;
        }

        fractions.add(newF);
        cash = new ArrayList<>();
    }

    public void addFraction(Fraction newF)
    {
        if (MinValue != null)
        {
            if (MinValue.greaterThen(newF)) MinValue = newF;
        }
        else
        {
            MinValue = newF;
        }

        if (MaxValue != null)
        {
            if (!MaxValue.greaterThen(newF)) MaxValue = newF;
        }
        else
        {
            MaxValue = newF;
        }

        fractions.add(newF);
        cash = null;
        cash = new ArrayList<>();
    }

    public int countNumberOfGreaterThen(double value)
    {
        Cash number = Compare(value);
        return number.greater;
    }

    int countNumberLesserThen(double value)
    {
        Cash number = Compare(value);
        return number.less;
    }

    public Fraction findMin() throws Exception
    {
        if (MinValue == null) throw new Exception();
        return MinValue;
    }

    public Fraction findMax() throws Exception
    {
        if (MaxValue == null) throw new Exception();
        return MaxValue;
    }

    private class Cash
    {
        private double value;
        protected int greater;
        protected int less;

        public Cash(double number, int greater, int less)
        {
            this.value = number;
            this.greater = greater;
            this.less = less;
        }

        public double getValue()
        {
            return value;
        }

        public int getGreater()
        {
            return greater;
        }

        public int getLess()
        {
            return less;
        }
    }

    private Cash Compare(double value)
    {
        for (int i = 0; i < cash.size(); i++)
        {
            if (cash.get(i).getValue() == value) return cash.get(i);
        }

        int less = 0, greater = 0;
        for (int i = 0; i < fractions.size(); i++)
        {
            if (fractions.get(i).Value() > value) greater++;
            if (fractions.get(i).Value() < value) less++;
        }
        Cash newC = new Cash(value, greater, less);
        cash.add(newC);
        return newC;
    }

    protected ArrayList<Cash> cash;
    protected ArrayList<Fraction> fractions;
    protected Fraction MaxValue;
    protected Fraction MinValue;


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
        String buffer = null;
        for (int i = 0; i < fractions.size(); i++)
        {
            buffer += fractions.get(i).toString() + " ";
        }
        return buffer;
    }
}