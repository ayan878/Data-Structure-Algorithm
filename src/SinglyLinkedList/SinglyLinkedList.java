package SinglyLinkedList;

public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	public Node createSinglyLinkedList(int nodeValue) {
//		creating a head node
		head =new Node();

//		creating a new node
		Node node =new Node();

//		Accesses the next field of the node object and assign with null;
		node.next=null;

//		Accesses the value field of the node object and assigned with nodeValue
		node.value=nodeValue;

//		The instance variable head now points to the newly created node. This sets the starting point of the singly linked list.
		head=node;

//		an instance variable tail in the class to hold the reference to the last node of the linked list and pointing to newly node
		tail=node;
		size=1; //in this case size of Singly LinkedList is 1
		return head;
	}
	
	// Insert Method SinglyLinkList
	public void insertInLinkList( int nodeValue, int location){
		Node node =new Node();
		node.value=nodeValue;
		if(head==null) {
			createSinglyLinkedList(nodeValue);
		}
		else if (location==0) {
			node.next=head;
			head=node;
		}
		else if (location>=size) {
			node.next=null;
			tail.next=node;
			tail=node;
		}
		else {
			Node tempNode=head;
			int index =0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			Node nextNode =tempNode.next;
			tempNode.next=nextNode;
		}
		size++;
	}
}
