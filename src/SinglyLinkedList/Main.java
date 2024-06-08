package SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SinglyLinkedList sll =new SinglyLinkedList();
    //single linked list
   sll.createSinglyLinkedList(5);
   System.out.println(sll.head.value);
   
   //insertion
        sll.insertInLinkList(6, 1);

   System.out.println(sll.head.next.value);
	}
}
