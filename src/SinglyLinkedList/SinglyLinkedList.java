package SinglyLinkedList;

public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	public Node createSinlyLiskedList(int nodeValue) {
		head =new Node();
		Node node =new Node();
		node.next=null;
		node.value=nodeValue;
		head=node;
		tail=node;
		size=1; //in this case size of Singly LinkedList is 1
		return head;
	}
	
	// Insert Method SinglyLinkList
	public void insertInLinkList( int nodeValue, int location){
		Node node =new Node();
		node.value=nodeValue;
		if(head==null) {
			createSinlyLiskedList(nodeValue);
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
