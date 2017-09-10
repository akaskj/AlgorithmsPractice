package main.java.sort;

/**
 * Created by Akash
 * Time complexity of O(n2)
 */
public class SelectionSort {
    private void selectionSort(int arr[]) {

        for (int i = 0; i<arr.length; i++) {

            int min = i;
            for (int j = i+1; j<arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
    }

    private void printArray(int arr[]) {
        for (int anArr : arr) {
            System.out.println(anArr);
        }
    }

    public static void main(String args[]) {
        int arr[] = {3,2,6,4,8,9,1};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        selectionSort.printArray(arr);
    }
}
