package Recusion;

import java.util.Scanner;

public class fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		
		
		fibbonacci obj =new fibbonacci();
		var result = obj.fib(num);
		System.out.println(result);


	}
public int fib(int n) {
	if (n==0 || n==1) {
		return n;
	}
	
	return fib(n-1)+fib(n-2);
}
}
