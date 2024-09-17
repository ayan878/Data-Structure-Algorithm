package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.createDoublyLinkedList(8);
        System.out.println(dll.head.value);
        dll.insertDoublyLinkedList(0,0);
        System.out.println(dll.head.value);
        dll.insertDoublyLinkedList(1,1);
        dll.insertDoublyLinkedList(2,2);
        dll.insertDoublyLinkedList(3,3);
        dll.insertDoublyLinkedList(4,4);
        System.out.println(dll.head.next.value);
        System.out.println(dll.head.next.next.value);
        System.out.println(dll.head.next.next.next.value);
        System.out.println(dll.head.next.next.next.next.value);

        dll.traverse();
        dll.reverse();
        dll.searching(4);
        dll.delete(0);
        dll.traverse();
        dll.searching(4);
        dll.DeleteEntireList();
        dll.traverse();
    }

}
