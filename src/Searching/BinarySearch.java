package Searching;

public class BinarySearch {
    public int binarySearch(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                System.out.println("The element found at the index: " + mid);
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Value is not found");
        return -1; // If target is not found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(arr, 9);
        System.out.println(result);
    }
}
