package com.java.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestingComplexityReorderFirstSelectedItem {

    public static void main(String[] args) {
        int selectd = 300;
        int size = 2000000;

        Consumer<Object> method1 = (arg) -> {
            System.out.println("***method 1");
            List<Integer> result = new ArrayList<>(size);
            result.add(selectd);
            result.addAll(IntStream.range(0, size).filter(item -> item != selectd).boxed().collect(Collectors.toList()));
        };

        Consumer<Object> method2 = (arg) -> {
            System.out.println("***method 2");
            List<Integer> result = new ArrayList<>();
            		result.add(selectd);
            		for (int i = 0; i < size ; i++) {
                			if(i != selectd) {
                    				result.add(i);
                    			}
                		}
        };
        Consumer<Object> method3 = (arg) -> {
            System.out.println("***method 3");
            List<Integer> result = IntStream.range(0, size).boxed().collect(Collectors.toList());
            result.add(0, result.remove(selectd));
        };

        Consumer<Object> method4 = (arg) -> {
            System.out.println("***method 4");
            List<Integer> result = new ArrayList<>(size);
            result.add(selectd);
            for (int i = 0; i < size ; i++) {
                if(i != selectd) {
                    result.add(i);
                }
            }
        };
        measurePerformance(method4);
        measurePerformance(method1);
        measurePerformance(method2);
        measurePerformance(method3);
    }

    public static void printTime() {
        System.out.println(System.currentTimeMillis());
    }

    public static void measurePerformance(Consumer consumer) {
        long startTime = System.currentTimeMillis();
        consumer.accept(null);
        System.out.println("Time executed: " + (System.currentTimeMillis() - startTime));
    }
}
