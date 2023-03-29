package Recusion_Interviews_Questions;

import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1:");
		int num1 =sc.nextInt();
		
		System.out.println("Enter the num2:");
		int num2 =sc.nextInt();
		FindGCD obj =new FindGCD();
		var result = obj.gcd(num1,num2);
		System.out.println(result);

	}
	public int gcd(int a,int b) {
		//base condition
		if (a<0||b<0) {
			return -1;
		}
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);//gcd(a,b)=gcd(b,a%b)
	}

}
