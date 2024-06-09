package SinglyLinkedList;

public class SinglyLinkedListQueue {
    private ListNode head;
    private ListNode tail;
    public SinglyLinkedListQueue(){
        this.head=null;
        this.tail=null;
    }

    // Enqueue operation: Insert a new node at the end of the list
    public void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SinglyLinkedListQueue sllQueue=new SinglyLinkedListQueue();

        sllQueue.enqueue(11);
        sllQueue.enqueue(7);
        sllQueue.enqueue(3);
        sllQueue.enqueue(5);

        sllQueue.display();
    }
}
