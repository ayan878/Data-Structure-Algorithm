package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {

    Node head;
    Node tail;
    int size;

    public CircularSinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public Node createCircularSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node; // Circular, so it points to itself
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCircularSinglyLinkedList(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;

        if (head == null) {
            // If the list is empty, create a new circular list
            createCircularSinglyLinkedList(nodeValue);
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
        Node currentNode = head;
        int index = size;
        while (index > 0) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
            index--;
        }
        System.out.println("(head)"); // To indicate the circular nature of the list
    }
    // Method to Searching of the circular linked list
    public void search(int nodeValue) {
        if (head != null) {
            Node currentNode = head;
            for (int i=0;i<size;i++){
                if(currentNode.value==nodeValue){
                    System.out.println("Value: "+currentNode.value+" Posittion: "+ i);
                }
                currentNode = currentNode.next;
            }
        }
        System.out.println("Node not found! ");
    }
    // Method to delete the circular linked list

    // Method to delete a node from the circular linked list
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The list does not exist!");
            return;
        }

        // Case 1: Delete at the beginning
        if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            // Case 1a: Only one node was present
            if (size == 0) {
                tail = null;
                head = null;
            }
        } else if (location >= size) {
            // Case 2: Delete at the end
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode.next == head) {
                head.next = null;
                head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            // Case 3: Delete in the middle
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    public void deleteCll(){
        head=null;
        tail.next=null;
        tail=null;
    }
}
