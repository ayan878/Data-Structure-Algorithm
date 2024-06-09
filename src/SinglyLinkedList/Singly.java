package SinglyLinkedList;

public class Singly {

    private ListNode head;

    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void traverse() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
        public static void main (String[]args){

            Singly sll = new Singly();

//        Creating node
//            This line creates a new ListNode object with the data value 11.
//            The head field of the sll object is set to reference this new ListNode object.
//            Now, sll.head points to the ListNode with the value 11

            sll.head = new ListNode(11);
            ListNode second = new ListNode(5);
            ListNode third = new ListNode(3);
            ListNode forth = new ListNode(7);

//        connecting node
            sll.head.next = second;
            second.next = third;
            third.next = forth;
            forth.next = null;

            sll.traverse();

        }
}