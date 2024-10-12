package SinglyLinkedList;

class Node {
    int value;
    Node next;
}

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        head = node;
        tail = node;
        size++;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        }

        if (location == 0) {
            // Insert at the beginning
            node.next = head;
            head = node;
            size++;
        }
//		insert at the end of the list
        if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        }
    }

    public void traverse() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + " " + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void reverse() {
        Node curr = head;
        Node next = null;
        Node prev = null;
        tail = head; // Update the tail to the old head before reversal

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev; // Update the head to the new head after reversal
    }

    public Node add() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;

            temp.value = temp.value + 1;
        }
        return temp;
    }
}

