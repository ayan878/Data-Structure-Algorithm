package Big_O_Interviews_Questions;

public class PairsArray {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int a[] = {2,3,4,8};  
				PairsArray obj =new PairsArray();
				obj.pair_Array(a);

			}
			void pair_Array(int [] arr) {					
				int sum=0;									//----->O(1)
				int Pro=1;									//----->O(1)
				for (int i=0; i<arr.length ;i++) {			//----->O(N)
					sum+=arr[i];							//----->O(1)
				}
				for (int i=0; i<arr.length ;i++) {			//----->O(N)
					Pro*=arr[i];							//----->O(1)
				}
				System.out.println(sum+ " " +Pro);			//----->O(1)
															//Total Time Complexity----->O(N)Dominant
			

	}

}
