package SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SinglyLinkedList sll =new SinglyLinkedList();
    //single linked list
   sll.createSinglyLinkedList(5);
//   System.out.println(sll.head.value);
   
   //insertion
        sll.insertInLinkedList(10, 0);
        sll.insertInLinkedList(1, 1);
        sll.insertInLinkedList(2, 2);
        sll.insertInLinkedList(3, 3);

   System.out.println(sll.head.value);
   sll.traverse();
   sll.reverse();
   sll.traverse();
   sll.add();
   sll.traverse();
	}
}
