package Searching;

public class LinearSearch {
    public static  int linearSearch(int nums[],int value) {
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]==nums[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={12,7,8,4,1,6,3,5};
        int result= linearSearch(nums,6);
        System.out.println(result);
    }

}
