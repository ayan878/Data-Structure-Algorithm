package Sorting;

import java.util.Arrays;
class Count {
    public static int heightChecker(int[] heights) {

        int[] expected=new int[heights.length];
        int range = Arrays.stream(heights).max().getAsInt();
        int[] C=new int[range+1];

//      set all C[i] to 0;
        for(int i=0;i<range;i++){
            C[i]=0;
        }
//      Count frequency
        for(int j=0;j<range;j++){
            C[heights[j]]++;
        }
//      Commulative frequency
        for(int j=1;j<range;j++){
            C[j]+=C[j-1];
        }

        for(int j=heights.length-1;j>=0;j--){
            expected[C[heights[j]]-1]=heights[j];
            C[heights[j]]--;
        }

        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]==expected[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights={2, 5, 3, 0, 2, 3, 0, 3};
        System.out.println(heightChecker(heights));
    }
}