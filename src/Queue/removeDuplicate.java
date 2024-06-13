package Queue;

import java.util.Arrays;

public class removeDuplicate {

    // Make the remove method static
    public static int[] remove(int[] arr) {
        int range= Arrays.stream(arr).max().getAsInt();
        int[] arr2 = new int[range];
        int index = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr2[index++] = arr[i];
            }
        }
        arr2[index++] = arr[arr.length - 1];
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 5, 2};
        int[] result = removeDuplicate.remove(arr);
        System.out.println(Arrays.toString(result));
    }
}
