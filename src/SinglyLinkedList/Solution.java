package SinglyLinkedList;

import java.util.Arrays;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int sumSub=0;
        int newArr[]= new int[n*(n+1)/2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sumSub+=nums[j];
                newArr[count]=sumSub;
                count++;
            }
            sumSub=0;
        }
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        for(int i=0;i<right;i++){
            sumSub+=newArr[i];
        }
        return sumSub;
    }

    public static void main(String[] args) {
        Solution sl=new Solution();
        int arr[]={1,2,3,4};
        int result =sl.rangeSum(arr,4,1,5);
        System.out.println(result);
    }
}