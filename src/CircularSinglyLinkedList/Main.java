package CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList cll=new CircularSinglyLinkedList();
        cll.createCircularSinglyLinkedList(5);
        System.out.println(cll.head.value);
        cll.insertCircularSinglyLinkedList(2,2);
        cll.insertCircularSinglyLinkedList(1,1);
        cll.insertCircularSinglyLinkedList(4,3);
        cll.insertCircularSinglyLinkedList(7,5);
        cll.insertCircularSinglyLinkedList(5,4);

        // traverse or print without method
        System.out.println(cll.head.next.value);
        System.out.println(cll.head.next.next.value);
        System.out.println(cll.head.next.next.next.value);
        System.out.println(cll.head.next.next.next.next.value);
        System.out.println(cll.head.next.next.next.next.next.value);

        // traverse print with method
        cll.traverse();
        // searching
        cll.search(2);
        cll.deleteNode(2);
        cll.traverse();
        cll.deleteCll();
        cll.traverse();
    }
}
