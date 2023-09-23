package Array;

public class Main {
	public static void main(String[] args) {
	InsertionArray Ins =new InsertionArray(5);
	Ins.Insert(0, 0);	//Successfully Inserted
	Ins.Insert(1, 10); //Successfully Inserted
	Ins.Insert(2, 20); //Successfully Inserted
	Ins.Insert(1,30);   //index arr[1] Already occupied 
	Ins.Insert(12, 120); //index out of bound becouse size of array is 5
	System.out.println("Given Array:" +Ins.arr);
	
	// Accessing the Array
	System.out.println(Ins.arr[0]);
	System.out.println(Ins.arr[2]);
	//OR
	var firstElement=Ins.arr[0];
	System.out.println(firstElement);
	
	//Array transverse
	Ins. traverseArray();
	
	//delete array value at index
//	deleteArrayElement del = new deleteArrayElement();
//	del.deleteValue(0);
}
}
