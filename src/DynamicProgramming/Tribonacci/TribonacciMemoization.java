package DynamicProgramming.Tribonacci;

import java.util.HashMap;

public class TribonacciMemoization {

    public static Integer trib(int n, HashMap<Integer,Integer> memo){
        if(n==0 || n==1)return 0;
        if(n==2)return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result =trib(n-1,memo)+trib(n-2,memo)+trib(n-3,memo);

        return result;
    }

    public static void main(String[] args) {
        HashMap<Integer,Integer> memo=new HashMap<>();
        System.out.println(trib(5,memo));
    }
}
