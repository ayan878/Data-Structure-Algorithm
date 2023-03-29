package Data_Structure;

import java.util.Scanner;

//Java program to find factorial of given number
class Recursion_Vs_Iteration {

	// ----- Recursion -----
	// method to find factorial of given number
	static int factorialUsingRecursion(int n)
	{
		if (n == 0)
			return 1;

		// recursion call
		return n * factorialUsingRecursion(n - 1);
	}

	// ----- Iteration -----
	// Method to find the factorial of a given number
	static int factorialUsingIteration(int n)
	{
		int res = 1, i;

		// using iteration
		for (i = 2; i <= n; i++)
			res *= i;

		return res;
	}

	// Driver method
	public static void main(String[] args)
	{
	System.out.println("Enter Number To Find Factorial");
		Scanner scan =new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Factorial of " + num
						+ " using Recursion is: "
						+ factorialUsingRecursion(num));

		System.out.println("Factorial of " + num
						+ " using Iteration is: "
						+ factorialUsingIteration(num));
	}
}

