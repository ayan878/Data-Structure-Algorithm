package Recusion_Interviews_Questions;

import java.util.Scanner;

public class sumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the digit:");
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		//Creating Object 
		sumofDigits obj = new sumofDigits();
		//putting the value of n in num
		var result =obj.sum(num);
		System.out.println(result);
	
		
	}
public static int sum(int n) {
	if(n==0) {
		return 0;
		}
	if(n<0) {
		return -1;
	}
	
	return n%10+sum(n/10);
	
}
}
