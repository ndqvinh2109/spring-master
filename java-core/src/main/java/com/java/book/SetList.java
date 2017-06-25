package com.java.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Quang on 02/19/2017.
 */
public class SetList {

    public static void setDouble(Double d) {
        System.out.println("Object " + d);
    }

    public static void setDouble(double d) {
        System.out.println("Primitive type " + d);
    }

    public static void main(String[] args) {
        double d = 9;
        Double aDouble = 9d;

        SetList.setDouble(d);
        SetList.setDouble(aDouble);

        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        System.out.println(set + " " + list);
        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
        }
        System.out.println(set + " " + list);
    }
}
