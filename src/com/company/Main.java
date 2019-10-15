package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Polynomial polynomial1 = new Polynomial();
        polynomial1.add(1, 1);
        polynomial1.add(2, 2);
        polynomial1.add(3, 3);

        System.out.println(polynomial1.toString());

        Polynomial polynomial2 = new Polynomial();
        polynomial2.add(5, 2);
        polynomial2.add(8, 2);

        Polynomial polynomial3 = polynomial1.concatenate(polynomial1, polynomial2);
        System.out.println(polynomial3.toString() + "=" + polynomial3.findValue(1));
    }
}