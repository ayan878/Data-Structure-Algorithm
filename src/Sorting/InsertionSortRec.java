package Sorting;

import java.util.Arrays;

public class InsertionSortRec {
    public static void recursiveInsertionSort(int[] arr, int n) {
        // Base case: If the array has only one element, it is already sorted.
        if (n <= 1) {
            return;
        }

        // Sort the first n-1 elements recursively
        recursiveInsertionSort(arr, n - 1);

        // Insert the nth element into its correct position in the sorted array
        int key = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        System.out.println("Original Array: " + Arrays.toString(arr));

        recursiveInsertionSort(arr, arr.length);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
