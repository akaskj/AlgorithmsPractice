package main.java.sort;

/**
 * Created by Akash
 * Time complexity O(n2)
 */
public class BubbleSort {
    private void sorter(int arr[]) {

        int len = arr.length - 1;
        for (int i = 0; i<len; i++) {
            for (int j = 0; j< len-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    private void printArray(int arr[]) {
        for (int a:arr) {
            System.out.println(a);
        }
    }

    public static void main(String args[]) {
        int arr[] = {10,50,30,22,56,12,8};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sorter(arr);
        bubbleSort.printArray(arr);
    }
}
