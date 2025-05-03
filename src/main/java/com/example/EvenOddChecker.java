package com.example;

public class EvenOddChecker {
    public static String checkEvenOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("The number " + number + " is " + checkEvenOdd(number));
    }
}
