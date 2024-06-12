package ArrayDemo;

import java.util.Arrays;

public class removeEvenFromArray {
    public static void removeEven(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={2,5,8,7,4,1,9,6,3,};
        removeEven(arr);
    }
}
