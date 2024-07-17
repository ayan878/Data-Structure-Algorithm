package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.createDoublyLinkedList(8);
        System.out.println(dll.head.value);
        dll.insertDoublyLinkedList(5,0);
        System.out.println(dll.head.value);
        dll.insertDoublyLinkedList(1,1);
        dll.insertDoublyLinkedList(2,2);
        dll.insertDoublyLinkedList(3,3);
        System.out.println(dll.head.next.value);
        System.out.println(dll.head.next.next.value);
        System.out.println(dll.head.next.next.next.value);


    }
}
