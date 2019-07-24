package com.alprael;

public class ByteShortValues {

  public static void main(String[] args) {

    byte myByte = 127;
    short myShort = 32_000;
    int myInt = 100_000;

    long myLong = 50_000 + 10 * (myByte + myShort + myInt);

    System.out.println(myLong);

    short shortTotal = (short) (50_000 + 10 * (myByte + myShort + myInt));

    System.out.println(shortTotal);

  }

}
