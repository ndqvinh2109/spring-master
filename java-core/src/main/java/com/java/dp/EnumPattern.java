package com.java.dp;

/**
 * Created by Quang on 01/04/2017.
 */
public enum EnumPattern {
    INSTANCE(2);

    private EnumPattern(int value) {
        this.value = value;
    }
    private int value;

    public int getValue() {
        return value;
    }
}

class EnumExample {
    public static void main(String[] args) {
        System.out.println(EnumPattern.INSTANCE.getValue());
    }
}