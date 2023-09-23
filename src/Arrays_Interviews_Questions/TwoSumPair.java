package Arrays_Interviews_Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSumPair {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(bf.readLine());
        int arr[] = new int[n];

        // Read the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        // Read the target sum
        System.out.print("Enter the target sum: ");
        int targetSum = Integer.parseInt(bf.readLine());

        // Find pairs with the given sum
        System.out.println("Pairs with sum " + targetSum + ":");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + targetSum);
                }
            }
        }
    }
}
