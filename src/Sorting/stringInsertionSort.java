package Sorting;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class stringInsertionSort {
	
	private static void InsertionSort(String[] arr) {
		// TODO Auto-generated method stub
		
		
		 int n = arr.length;
	        for (int i = 1; i < n; i++) {
	            String key = arr[i];
	            int j = i - 1;

	            // Compare strings using compareTo method
	            while (j >= 0 && arr[j].compareTo(key) > 0) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;
	        }
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
    	System.out.println("Enter the number you want to insert:");
    	int n=sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter String element in array:");
        for(int i=0; i<n;i++)
        	arr[i]=sc.nextLine();
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        InsertionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

	}

}
