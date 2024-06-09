package SinglyLinkedList;

public class SinglyLinkedListStack {
    ListNode head;
    public static class ListNode{
        ListNode next;
        int value;

        public ListNode(int value){
            this.next=null;
            this.value=value;
        }
    }

    public void traverse() {
        ListNode current=head;

        while (current!=null){
            System.out.print(current.value+"-->");
            current=current.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        SinglyLinkedListStack sllStack=new SinglyLinkedListStack();
        sllStack.head=new ListNode(11);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(7);
        ListNode forth=new ListNode(3);

        sllStack.head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=null;

        // Display List
        sllStack.traverse();
    }
}
