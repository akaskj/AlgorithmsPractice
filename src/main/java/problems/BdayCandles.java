package main.java.problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/*
*
* Colleen is turning "n" years old! Therefore, she has  candles of various heights on her cake, and candle "i" has height "h" .
* Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.
*
* Given the  for each individual candle, find and print the number of candles she can successfully blow out.
*
* */

public class BdayCandles {

    public static void main (String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

        int[] arr = {3,2,1,3};

        int maxi = Arrays.stream(arr).max().getAsInt();

        int[] test = Arrays.stream(arr).filter(s-> s >= maxi).toArray();

        System.out.println(test.length);


    }

}
