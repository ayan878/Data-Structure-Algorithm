package SinglyLinkedList;

// in implement in one module
public class SLL {

    private ListNode head;

    public static class  ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        int count=0;
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
            count++;

        }
        System.out.println("null");
        System.out.println(count);
    }
    public void insertBeginning(int value){
        ListNode newNode= new ListNode(value);
        newNode.next=head;
        head=newNode;
    }
        public static void main(String[] args) {
            SLL sll= new SLL();
//            sll.head= new ListNode(10);
//            ListNode second=new ListNode(1);
//            ListNode third=new ListNode(8);
//            ListNode forth=new ListNode(11);

//            connect node
//            sll.head.next=second;
//            second.next=third;
//            third.next=forth;
//            forth.next=null;
            // inserting node at beginning
            sll.insertBeginning(5);
            sll.insertBeginning(7);

            sll.display();


        }

}

