package com.java.book;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by Quang on 04/06/2017.
 */
public class ConsumeTest {
    public static void main(String[] args) {
        Consumer<String> consumer = ConsumeTest::printNames;
        consumer.accept("Vinh");
        consumer.accept("Dat");

        List<String> str =  new ArrayList<>();
        str.add("Vinh");

        str.stream().forEach(a -> {
            getCompany();
        });
    }

    private static void printNames(String name) {
        System.out.println(name);
    }

    private static void getCompany() {
        try {
            throw new ExampleCheckedException("Vinh");
        } catch (ExampleCheckedException e) {
            e.printStackTrace();
        }
    }
}
