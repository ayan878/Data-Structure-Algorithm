package Recusion_Interviews_Questions;

import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		
		BinaryConversion obj =new BinaryConversion();
		var result = obj.binary(num);
		System.out.println(result);


	}
public int binary(int n) {
	if(n==0) {
		return 0;
	}
	return n%2+10*binary(n/2);
}
}
