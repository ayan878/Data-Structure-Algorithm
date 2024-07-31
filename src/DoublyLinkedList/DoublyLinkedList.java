package DoublyLinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size = 0;

    // Create a new doubly linked list with a single node
    public Node createDoublyLinkedList(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        System.out.println("Doubly Linked List created with node: " + newNode.value);
        return head;
    }

    // Insert a node at a specified location
    public void insertDoublyLinkedList(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        if (head == null) {
            createDoublyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next.prev = newNode;
            tempNode.next = newNode;
        }
        size++;
    }


    // Traverse the list from head to tail
    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    // Traverse the list from tail to head
    public void reverse() {
        if (tail == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node tempNode = tail;
        while (tempNode != null) {
            System.out.print(tempNode.value + " <- ");
            tempNode = tempNode.prev;
        }
        System.out.println("null");
    }
    public void searching(int nodeValue) {
        Node tempNode = head;
        int index = 0;
        boolean found = false;  // Flag to check if the node is found

        if (head == null) {
            System.out.println("Doubly LinkedList is empty");
            return;
        }

        while (tempNode != null) {
            if (tempNode.value == nodeValue) {
                System.out.println(nodeValue + " is at index " + index);
                found = true;  // Set the flag to true
                break;  // Exit the loop once the node is found
            }
            tempNode = tempNode.next;
            index++;
        }

        if (!found) {
            System.out.println(nodeValue + " is not found in the list.");
        }
    }


}
