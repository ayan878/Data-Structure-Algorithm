package Recusion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int num =sc.nextInt();
		factorial obj =new factorial();
		var result = obj.fact(num);
		System.out.println(result);


	}
	public int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

}
