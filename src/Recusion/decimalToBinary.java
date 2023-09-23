package Recusion;

public class decimalToBinary {


//it is not recursion methods
	public static void main(String[] args)
	{
		int decimal = 6;
		String binary = decimalToBinary(decimal);
		System.out.println("Decimal: " + decimal);
		System.out.println("Binary: " + binary);
	}

	public static String decimalToBinary(int num)
	{
		int remainder;
		String binaryNum = "";
		while (num > 0) {
			remainder = num % 2;
			binaryNum = remainder + binaryNum;
			num = num / 2;
		}
		return binaryNum;

	}


}
