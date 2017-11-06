package main.java.problems;

import java.util.Arrays;
import java.util.Scanner;

/*
*
* Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
* four of the five integers. Then print the respective minimum and maximum values as a single line of two
* space-separated long integers.
*
* */

public class MinMaxSum {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        for(int arr_i=0; arr_i < 5; arr_i++){
//            arr[arr_i] = in.nextInt();
//        }
        long[] arr = {1,2,3,4,5};

        Long min = null;
        Long max = null;

        for (int i = 0; i < 5; i++) {
            long sum = Arrays.stream(arr).sum();

            sum = sum - arr[i];

            if (min == null || sum < min) {
                min = sum;
            }

            if (max == null || sum > max) {
                max = sum;
            }

        }

        System.out.println(min + " " + max);

    }
}