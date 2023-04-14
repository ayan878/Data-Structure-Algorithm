package Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack newStack =new Stack(4);
      
      boolean result= newStack.isEmpty();
      System.out.println("Stack is empty:"+result);
      
      newStack.isFull();
      newStack.push(1);
      newStack.push(2);
      newStack.push(3);
      newStack.push(4);
      
     int pop= newStack.pop();
     int pop1= newStack.pop();
     System.out.println(pop);//4
     System.out.println(pop1);//3
     
//     peek
     System.out.println("Peek:" +newStack.peek());//2 because top element is 2 after popping
     
    //to element of stack/array
     System.out.println(newStack.arr);
     
     //Delete stack
     newStack.deleteStack();
      
      }

}
