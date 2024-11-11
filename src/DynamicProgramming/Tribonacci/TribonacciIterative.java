package DynamicProgramming.Tribonacci;

public class TribonacciIterative {

    public static int trib(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;

        int first = 0;
        int second = 0;
        int third = 1;
        int sum = 0;

        // Calculate Tribonacci values starting from T(3)
        for (int i = 3; i <= n; i++) {
            sum = first + second + third;
            first = second;
            second = third;
            third = sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Test the trib function with n = 5
        System.out.println(trib(5));  // Output should be 4 (T(5) = 4)
    }
}

//TC:O(n);
//SC:O(n);