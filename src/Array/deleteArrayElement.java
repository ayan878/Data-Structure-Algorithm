package Array;


//value from array
public class deleteArrayElement {
//	int [] arr=null;
	
 public void deleteValue(int valueToDeleteIndex) {
	 try {
		 
		 arr[valueToDeleteIndex]= Integer.MIN_VALUE;
		 System.out.println("The value has been deleted succesfully");
	 }catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println(e);
	 }
 }
}
