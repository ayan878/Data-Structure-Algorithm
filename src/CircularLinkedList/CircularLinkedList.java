package CircularLinkedList;

public class CircularLinkedList {

    Node head;
    Node tail;
    int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public Node createCircularLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node; // Circular, so it points to itself
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCircularLinkedList(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;

        if (head == null) {
            // If the list is empty, create a new circular list
            createCircularLinkedList(nodeValue);
        } else if (location == 0) {
            // Insert at the head
            newNode.next = head;
            head = newNode;
            tail.next = newNode; // Update tail's next to maintain circularity
            size++;
        } else if (location >= size) {
            // Insert at the end
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode; // Update tail
            size++;
        } else {
            // Insert at a specific position
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            size++;

            if (newNode.next == head) {
                tail = newNode; // Update tail if newNode is inserted at the end
            }
        }
    }
    // Method to traverse and print the circular linked list
    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node tempNode = head;
        int index = size;
        while (index > 0) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
            index--;
        }
        System.out.println("(head)"); // To indicate the circular nature of the list
    }
}
