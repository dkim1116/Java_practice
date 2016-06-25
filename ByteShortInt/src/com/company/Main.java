package com.danielkim1116;

public class Main {

    public static void main(String[] args) {
	    byte firstByte = 125;
        short firstShort = 32000;
        int firstInt = 63000152;
        long firstLong = ((50000L + 10L) * (firstByte + firstShort + firstInt));
        System.out.println(firstLong);
    }
}
