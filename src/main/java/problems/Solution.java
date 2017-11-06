package main.java.problems;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] a = new int[n];
        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;
        
        for (int i = 0; i < n; i++) {
            
            a[i] = in.nextInt();

            System.out.println(a[i]);
            
            if (a[i] < 0) {
              positive_count++;
              System.out.println(positive_count);
            } else if (a[i] > 0) {
                negative_count++;
            } else {
                zero_count = 0;
            }
            
        }

        float positive_fraction = (float)positive_count / (float)(n-1);

        System.out.println(positive_fraction);
        System.out.println(negative_count/(n-1));
        System.out.println(zero_count/(n-1));
        
    }
}