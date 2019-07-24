package com.alprael;

public class ByteShortValues {

  public static void main(String[] args) {

    byte myMaxByte = Byte.MAX_VALUE;
    byte myMinByte = Byte.MIN_VALUE;
    System.out.println("Byte max value= " + myMaxByte);
    System.out.println("Byte min value= " + myMinByte);

    short myMaxShort = Short.MAX_VALUE;
    short myMinShort = Short.MIN_VALUE;
    System.out.println("Short max value= " + myMaxShort);
    System.out.println("Short min value= " + myMinShort);

    int myMaxInt = Integer.MAX_VALUE;
    int myMinInt = Integer.MIN_VALUE;
    System.out.println("Integer max value= " + myMaxInt);
    System.out.println("Integer min value= " + myMinInt);

    long myMaxLong = Long.MAX_VALUE;
    long myMinLong = Long.MIN_VALUE;
    System.out.println("Long max value= " + myMaxLong);
    System.out.println("Long min value= " + myMinLong);

    byte myByte = 127;
    short myShort = 32_000;
    int myInt = 100_000;

    long myLong = 50_000 + 10 * (myByte + myShort + myInt);
    System.out.println(myLong);

    short shortTotal = (short) (50_000 + 10 * (myByte + myShort + myInt));
    System.out.println(shortTotal);
    //Overflow

    float myMaxFloat = Float.MAX_VALUE;
    float myMinFloat = Float.MIN_VALUE;
    System.out.println("Float max value= " + myMaxFloat);
    System.out.println("Float min value= " + myMinFloat);

    double myMaxDouble = Double.MAX_VALUE;
    double myMinDouble = Double.MIN_VALUE;
    System.out.println("Double max value= " + myMaxDouble);
    System.out.println("Double min value= " + myMinDouble);

  }

}
