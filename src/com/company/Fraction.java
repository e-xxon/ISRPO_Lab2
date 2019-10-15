package com.company;

public class Fraction
{
    private int up;
    private int down;
    public Fraction(int up, int down)
    {
        this.up = up;
        this.down = down;
    }

    public int getUp()
    {
        return up;
    }

    public int getDown()
    {
        return down;
    }

    public void setUp(int up)
    {
        this.up = up;
    }

    public void setDown(int down)
    {
        this.down = down;
    }

    public int Value()
    {
        return (int) up / down;
    }

    public Boolean greaterThen(Fraction fraction)
    {
        return fraction.getUp() * this.getDown() - fraction.getDown() * this.getUp() < 0;
    }

    @Override
    public String toString()
    {
        return up + "/" + down;
    }
}
