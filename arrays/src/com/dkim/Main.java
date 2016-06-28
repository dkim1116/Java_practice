package com.dkim;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//	    int[] myIntArray = new int[10];
//        int[] mySecondIntArray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(mySecondIntArray[3]);
//
//
//    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i);
        }
        System.out.println("The sum is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter: " + number);
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
