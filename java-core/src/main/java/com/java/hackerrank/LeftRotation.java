package com.java.hackerrank;

import java.util.Scanner;

/**
 * Created by Quang on 10/22/2017.
 */
public class LeftRotation {

    public static int[] leftRotation(int[] arr, int n, int k) {
        int[] newArray = new int[n];
        for(int i = 0; i < n; i ++) {
            int index = (i + (n - k)) % n;
            newArray[i] = arr[index];
        }
        return newArray;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = leftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
