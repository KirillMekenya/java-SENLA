package com.company;

import java.util.Random;

public class Number {
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    public Number() {
        firstNumber = (new java.util.Random()).nextInt(999);
        secondNumber = (new java.util.Random()).nextInt(999);
        thirdNumber = (new java.util.Random()).nextInt(999);
    }

    public void difference() {
        String bigNumber = String.valueOf(firstNumber) + String.valueOf(secondNumber);
        int difference = Integer.parseInt(bigNumber) - thirdNumber;
        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        System.out.print(bigNumber + " - " + thirdNumber + " = " + difference);

    }

}
