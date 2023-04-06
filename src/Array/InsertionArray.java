package Array;

public class InsertionArray {

	int[] arr=null ;
	
// Constructor is just Initializing the all element of array with the of value of minimum integer value.
//bcz when we are creating an array of integer it tells all cell value is zero.
//but we don't want them to be zero so we creating constructors with minimum integer value.
	
public InsertionArray(int sizeOfArray) {
	arr= new int[sizeOfArray];
	for(int i=0; i<arr.length;i++) {
		arr[i]=Integer.MIN_VALUE;
	}
}
// Insert Method
public void  Insert(int location,int valueToBeInserted) {
	try {
//-214748364
		if (arr[location]==Integer.MIN_VALUE) {
			arr[location]=valueToBeInserted;
			System.out.println("Successfully Inserted");
		}
		else {
			System.out.println("This cell is already occupied");
		}
		
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid Index to access Array");
	}
	
  }
public void traverseArray() {
	try {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}catch(Exception e) {
		System.out.println("Array no longer exists");
	}
	
}
}
