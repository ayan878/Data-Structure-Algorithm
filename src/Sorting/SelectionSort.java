package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {2, 8, 1, 6, 7, 4, 6};

		//find minimum in the array
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			// Swap minimum 
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}
}
