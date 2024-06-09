package SinglyLinkedList;

public class SinglyLinkedListStack {
    ListNode head;

    public SinglyLinkedListStack(){
        this.head=null;
    }
    public void push(int data){
        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;
    }
    public void traverse() {
        ListNode current=head;

        while (current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        SinglyLinkedListStack sllStack=new SinglyLinkedListStack();
//        sllStack.head=new ListNode(11);
//        ListNode second=new ListNode(5);
//        ListNode third=new ListNode(7);
//        ListNode forth=new ListNode(3);
//
//        sllStack.head.next=second;
//        second.next=third;
//        third.next=forth;
//        forth.next=null;

        sllStack.push(11);
        sllStack.push(7);
        sllStack.push(3);
        sllStack.push(5);

        // Display List
        sllStack.traverse();
    }
}
