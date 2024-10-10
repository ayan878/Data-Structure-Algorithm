package ArrayDemo;

///{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, key));
        }
        out.flush();
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int quickSelect(int arr[], int low, int high, int k) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Number of elements in the left partition including pivot
            int leftSize = pivotIndex - low + 1;

            if (k == leftSize) {
                return arr[pivotIndex];
            } else if (k < leftSize) {
                return quickSelect(arr, low, pivotIndex - 1, k);
            } else {
                return quickSelect(arr, pivotIndex + 1, high, k - leftSize);
            }
        }

        return arr[low]; // When low == high, the single element is the answer
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int kthSmallest(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k);
    }
}