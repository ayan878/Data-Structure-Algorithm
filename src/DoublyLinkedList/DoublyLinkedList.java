package DoublyLinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size=0;

    public Node createDoublyLinkedList(int nodeValue) {
        Node newNode=new Node();
        head=newNode;
        tail=newNode;
        System.out.println(newNode);
        newNode.next=null;
        newNode.prev=null;
        newNode.value=nodeValue;
        size=1;
        return head;
    }
    public void insertDoublyLinkedList(int nodeValue,int location){
        Node newNode=new Node();
        newNode.value=nodeValue;
        if(head==null){
            createDoublyLinkedList(nodeValue);
            return;
        }
        else if(location==0){
            newNode.prev=null;
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        else if(location>=size) {
            newNode.next=null;
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        else {
            Node tempNode=head;
            int index=0;
            while( index < location-1) {
                tempNode.next=tempNode;
                index++;
            }
            newNode.prev=tempNode;
            newNode.next=tempNode.next;
            tempNode.next=newNode;
            tempNode.next.prev=newNode;
        }
        size++;
    }
}
