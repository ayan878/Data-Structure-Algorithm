package ArrayDemo;

public class MaxElement {
    public static int maxValue(int[] arr) {
        int left = 0, right = arr.length - 1;
        int max = Integer.MIN_VALUE;

        while (left <= right) {
            if (arr[left] > max) {
                max = arr[left];
            }
            if (arr[right] > max) {
                max = arr[right];
            }
            left++;
            right--;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {47, 2, 100, 101, 50};
        System.out.println(maxValue(arr));
    }
}
