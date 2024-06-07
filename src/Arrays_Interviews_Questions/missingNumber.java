package Arrays_Interviews_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class missingNumber {
	
	
private void missing() {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int size= sc.nextInt();
	System.out.println("Enter natural in series:");
	int[] arr =new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Original Array:"+Arrays.toString(arr));
	int expectedSum=((size+1)*(size+2))/2;// Sum of all numbers from 1 to n+1

//		This formula calculates the sum of all numbers from 1 to n+1, not from 1 to n.
//		For example, if n is 5, the sum would be (6 * 7) / 2 = 21, which includes the next number after n.
	int actualSum=0;
	for (int i=0;i<size;i++) {
		actualSum+=arr[i];
	}
	System.out.println("Missing Number:"+(expectedSum-actualSum));

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		int[] arr = new int[size];
		missingNumber ms = new missingNumber();
		ms.missing();

}
}
