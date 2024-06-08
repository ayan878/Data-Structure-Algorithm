package SinglyLinkedList;

// Implement in one module
public class SllEnd {

    private ListNode head;

    // creating node first
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /*insert at the end*/
    public void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

public void insertAtBeginning(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;
}
    public void display(){
        // Print the list to verify insertion
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        //insert node at the end
        SllEnd sllEnd = new SllEnd();
        sllEnd.insertAtEnd(7);
        sllEnd.insertAtEnd(5);
        sllEnd.insertAtEnd(11);

        // insert node at the beginning
        sllEnd.insertAtBeginning(3);
        sllEnd.insertAtBeginning(9);

        sllEnd.display();
    }
}
