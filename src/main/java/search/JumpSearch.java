package main.java.search;

/**
 * Created by Akash
 * Time complexity O(√n)
 */
public class JumpSearch {
    static int jumpSeach(int arr[], int m) {

        int n = arr.length;

        // Important part in the problem, what should be the step size??
        //  In the worst case, we have to do n/m jumps and if the last checked value is greater than the element to be searched for,
        // we perform m-1 comparisons more for linear search. Therefore the total number of comparisons in the worst case will be ((n/m) + m-1).
        // The value of the function ((n/m) + m-1) will be minimum when m = √n. Therefore, the best step size is m = √n.
        int step = (int) Math.floor(Math.sqrt(n));
        int stepLength = step;


        int prev = 0;
        /* -1 to avoid array out of bound exception for the last element
         because arr.length will start counting from 1 not 0
          */

        while (arr[Math.min(step,n)-1] < m) {
            prev = step;
            step += stepLength;
            if (prev > n)
                return -1;
        }

        for (int i = prev; i <= Math.min(step,n); i++) {
            if (arr[i] == m)
                return i;
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int m = 9;

        System.out.println(jumpSeach(arr, m));
    }
}
