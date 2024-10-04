package demo;

class Node {
    int value;
    Node next;
}

public class LinkedList {

    Node head;
    Node tail;
    int size = 0;

    // Method to create the linked list with a single node
    public Node createLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        head = node;
        tail = node;
        size++;
        return head;
    }

    // Method to insert a node at a specific location
    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createLinkedList(nodeValue);
            return;
        }

        if (location == 0) {  // Insert at the head
            node.next = head;
            head = node;
            size++;
        } else if (location >= size) {  // Insert at the tail
            tail.next = node;
            tail = node;
            node.next = null;
            size++;
        } else {  // Insert in the middle
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
            size++;
        }
    }

    // Method to traverse and print the linked list
    public void traverse() {
        System.out.println("Linked list:");
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    // Method to reverse the linked list
    public void reverse() {
        Node curr = head;
        Node next = null;
        Node prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // After reversal, update the head to the last element processed (prev)
        head = prev;
    }

    // Main method to test the LinkedList class
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLinkedList(10);
        System.out.println("Initial head value: " + ll.head.value);

        ll.insertLinkedList(5, 0);
        System.out.println("New head value after insertion at location 0: " + ll.head.value);
        ll.insertLinkedList(12, 4);

        ll.insertLinkedList(15, 1);
        ll.insertLinkedList(20, 3);
        ll.insertLinkedList(18, 5);
        ll.insertLinkedList(11, 6);
        
        ll.reverse();
        ll.traverse();
    }
}
