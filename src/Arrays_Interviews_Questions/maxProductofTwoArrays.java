package Arrays_Interviews_Questions;


public class maxProductofTwoArrays {

	public String maxPro(int[]arr) {
		// TODO Auto-generated method stub
		String pairs = "";
		int maxProduct=0;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]*arr[j]>maxProduct) {
					maxProduct=arr[i]*arr[j];
					pairs=Integer.toString(arr[i])+","+Integer.toString(arr[j]);	
				}
			}
		}
		return pairs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		maxProductofTwoArrays max= new maxProductofTwoArrays();
		String pairs =max.maxPro(arr);
		System.out.println(pairs);

	}

}
