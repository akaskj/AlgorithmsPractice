package main.java.search;

/**
 * Created by Akash
 *
 * Time complexity of O(log n)
 */
public class BinarySearch {
    private static int binarySearch (int a[], int l, int r, int m) {

        if (r>=l) {

            int mid = l + (r - l)/2;

            if (a[mid] == m) {
                return mid;
            }

            if (a[mid] > m) {
                return binarySearch(a, l, mid-1, m);
            }
            else {
                return binarySearch(a, mid+1, r, m);
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int a[] = {1,2,4,5};
        int r = a.length - 1;
        int m = 5;
        int l = 0;

        System.out.println(binarySearch(a, l, r, m));
    }
}
