package Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {


	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int j = 1; j < n; j++) 
		{
			int key = arr[j];
			int i = j - 1;

			while (i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}

			arr[i + 1] = key;
		}
	}

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number you want to insert:");
		int n=sc.nextInt();
		int[] arr = new int[n];

		//for taking random number 
		for(int i=0; i<n;i++)
			//        	
		arr[i]=new Random().nextInt(n);
		System.out.println("Original Array: " + Arrays.toString(arr));

		insertionSort(arr);

		System.out.println("Sorted Array: " + Arrays.toString(arr));
		long endTime = System.nanoTime();

		// Calculate the elapsed time in milliseconds
		long elapsedTimeMs = (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds

		System.out.println("Elapsed Time: " + elapsedTimeMs + " milliseconds");
	}
}
