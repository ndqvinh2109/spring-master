package com.java.hackerrank;

import java.util.Scanner;

public class Node<T extends Comparable<T>> {

    Node<T> left;
    Node<T> right;
    T data;

    public Node(T data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void insert(T value) {
        if (value.compareTo(this.data) <= 0) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }


    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }

        System.out.print(data + " ");

        if (right != null) {
            right.printInOrder();
        }
    }

    public boolean contains(T value) {
        if (value.compareTo(data) == 0) {
            return true;
        } else if (value.compareTo(data) < 0) {
            return (left == null) ? false : left.contains(value);
        } else {
            return (right == null) ? false: right.contains(value);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Node<Integer> root = new Node<Integer>(scanner.nextInt());
        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            root.insert(value);
        }
        scanner.close();

        root.printInOrder();
    }



}
