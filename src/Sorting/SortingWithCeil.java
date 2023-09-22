package Sorting;
import java.util.Arrays;

public class SortingWithCeil {

    public static void main(String[] args) {
        int[] x = {5, 6,2, 3, 4, 7};

        // Perform selection sort with ceiling values
        for (int i = 0; i < x.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < x.length; j++) {
                int min1 = (int) Math.ceil(x[j] / x[minIndex]);
                int min2 = (int) Math.ceil(x[minIndex] / x[j]);
                
                // Compare the ceiling values
                if (min1 < min2) {
                    minIndex = j;
                }
            }
            
            // Swap elements to sort
            int temp = x[i];
            x[i] = x[minIndex];
            x[minIndex] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(x));
    }
}
