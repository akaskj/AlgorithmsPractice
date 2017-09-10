package main.java.search;

/**
 * Created by Akash
 * Time complexity of O(n)
 */
public class LinearSearch {
    static int linearSearch(int args[], int m) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = {1,2,3,4};

        System.out.println(linearSearch(a, 10));

    }

}
