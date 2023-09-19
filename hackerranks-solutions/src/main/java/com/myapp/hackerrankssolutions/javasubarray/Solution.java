package com.myapp.hackerrankssolutions.javasubarray;

import java.util.Scanner;

public class Solution {

    public static int countNegative(int[] arr) {
        int count = 0;
        int len = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0)
                count++;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int add = arr[i];
            int k = 1;
            while (k <= len - 1) {
                add = add + arr[i + k];
                k++;
                if (add < 0) {
                    count++;
                }
            }
            len--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = countNegative(arr);
        System.out.println(ans);
    }
}