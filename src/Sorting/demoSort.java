package Sorting;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
public class demoSort {
    public static void insertionSort(int[] arr) {
        for(int j=1;j<arr.length;j++){
            int key=arr[j];
            int i=j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }
    }
    public static void main(String[] args) {
        int []arr={8,4,7,9,1,3,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}