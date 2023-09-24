package Sorting;
import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int range = 5;
        int A[] = {2, 5, 3, 0, 2, 3, 0, 3};
        int[] B = new int[A.length];
        int[] C = new int[range + 1];

        // Loop-1 for assigning value 0
        for (int i = 0; i < C.length; i++) {
            C[i] = 0;
        }
        System.out.println(Arrays.toString(C));

        // Loop-2 for counting how many times values occur from 0 to k
        for (int j = 0; j < A.length; j++) {
            C[A[j]]++;
        }
        System.out.println(Arrays.toString(C));

        // Loop-3 No. of elements <= index of C
        for (int i = 1; i <= range; i++) {
            C[i] += C[i - 1];
        }
        System.out.println(Arrays.toString(C));

        // Loop-4 for sorting the array
        for (int k = A.length - 1; k >= 0; k--) {
            B[C[A[k]] - 1] = A[k]; 
            C[A[k]]--;
        }
        System.out.println(Arrays.toString(B));
    }
}
