package com.java.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Quang on 01/04/2017.
 */
public class StrategyPattern {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Context context = new Context(new BubbleSort());
        context.arrange(numbers);
    }
}

interface Strategy {
    void sort(List<Integer> numbers);
}

class BubbleSort implements Strategy {
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Sorting list using bubble sort");
    }
}

class QuickSort implements Strategy {
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Sorting list using quick sort");
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(List<Integer> numbers) {
        strategy.sort(numbers);
    }
}