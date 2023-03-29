package Recusion_Interviews_Questions;

import java.util.Scanner;

public class FindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base:");
		int Base =sc.nextInt();
		
		System.out.println("Enter the exponent:");
		int Expo =sc.nextInt();
		FindPower obj =new FindPower();
		var result = obj.Power(Base,Expo);
		System.out.println(result);

	}
	public int Power(int base,int expo) {
		if(expo==1) {
			return base;
		}
		if (expo==0) {
			return 1;
		}
		return base*Power(base,expo-1);//X^n=X*X^n-1
	}

}
