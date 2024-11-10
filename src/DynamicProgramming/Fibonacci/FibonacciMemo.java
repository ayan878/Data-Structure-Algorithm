package DynamicProgramming.Fibonacci;

import java.util.HashMap;

public class FibonacciMemo {

    // Helper method for memoization
    public static int fib(int n, HashMap<Integer, Integer> memo) {
        // Base cases
        if (n == 0 || n == 1) {
            return n;
        }

        // Check if the value is already computed (memoization)
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Compute the value and store it in the memo map
        int result = fib(n - 1, memo) + fib(n - 2, memo);

        // Store the result in memoization map to avoid recomputation
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        int n = 6;

        // Create a memoization map to store previously computed Fibonacci numbers
        HashMap<Integer, Integer> memo = new HashMap<>();

        // Call the helper method with the initial input and the memo map
        System.out.println(fib(n, memo));
    }
}
