//package CircularDoublyLinkedList;
//
//public class CircularDoublyLinkedList {
//
//    Node head;
//    Node tail;
//    int size=0;
//
//    public Node createCircularDoublyLinkedList(int nodeValue) {
//        // Create a new node and initialize it
//        Node newNode = new Node();
//        newNode.value = nodeValue;
//        newNode.next = newNode;  // In a circular list, next points to itself
//        newNode.prev = newNode;  // In a circular list, prev points to itself
//
//        // Set the new node as both head and tail
//        head = newNode;
//        tail = newNode;
//
//        // Set the size of the list to 1
//        size = 1;
//
//        // Return the head of the list
//        return head;
//    }
//
//
//    public void insertCircularDoublyLinkedList(int nodeValue,int location){
//        Node newNode= new Node();
//        newNode.value=nodeValue;
//        if(head==null){
//            createCircularDoublyLinkedList();
//            return;
//        }
//        if(location==0){
//            newNode.prev=null;
//            newNode.next=tail;
//            head.prev=newNode;
//            head=newNode;
//            tail.next=newNode;
//
//        }
//    }
//}
