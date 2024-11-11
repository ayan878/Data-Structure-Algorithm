package DynamicProgramming.Fibonacci;

public class FibonacciIterative {
    public static void main(String[] args) {
        int n=6;
        int first=0;
        int second=1;
        int sumOfFib=0;
        for (int i = 2; i <=n ; i++) {
            sumOfFib=first+second;
            first=second;
            second=sumOfFib;
        }
        System.out.println(sumOfFib);
    }
}

//TC:0(n);
//SC:O(n)