package com.company;

public class Program {

    static int number = 479598;

    public static void main(String[] args) {
        int firstNumber = number / 100000;
        int secondNumber = number % 100000 / 10000;
        int thirdNumber = number % 100000 % 10000 / 1000;
        int fourthNumber = number % 100000 % 10000 % 1000 / 100;
        int fivethNumber = number % 100000 % 10000 % 1000 % 100 / 10;
        int sixthNumber = number % 100000 % 10000 % 1000 % 100 % 10 % 10;
        System.out.println(firstNumber + secondNumber + thirdNumber + fourthNumber + fivethNumber + sixthNumber);
    }
}