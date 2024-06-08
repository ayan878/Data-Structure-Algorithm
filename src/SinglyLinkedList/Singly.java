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

    public void display() {
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
            sll.head = new ListNode(11);
            ListNode second = new ListNode(5);
            ListNode third = new ListNode(3);
            ListNode forth = new ListNode(7);

//        connecting node
            sll.head.next = second;
            second.next = third;
            third.next = forth;
            forth.next = null;

            sll.display();

        }
}