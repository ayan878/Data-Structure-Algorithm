package ArrayDemo;

import java.util.Arrays;

public class reverseArray {
    public static void reverseArray(int[] arr){
        int left=0; int right=arr.length-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={2,4,7,9,1,3};
        reverseArray(arr);
    }
}
