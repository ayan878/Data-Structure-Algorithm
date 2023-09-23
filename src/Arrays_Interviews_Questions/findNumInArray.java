package Arrays_Interviews_Questions;

public class findNumInArray {
	
	
	public void LinearSearch(int[] intArray,int value) {
		for (int i=0;i<intArray.length;i++) {
			if (intArray[i]==value) {
				System.out.println("Value is found  at the index of "+i);
				return;
			}
		}
		System.out.println(value +"Value is not found");
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,};
		findNumInArray find=new findNumInArray();
		find.LinearSearch(arr, 5);	

	}

}
