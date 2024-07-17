package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll=new CircularLinkedList();
        cll.createCircularLinkedList(5);
        System.out.println(cll.head.value);
        cll.insertCircularLinkedList(7,1);
        cll.insertCircularLinkedList(3,2);
        cll.insertCircularLinkedList(2,3);
        cll.insertCircularLinkedList(6,4);

        // traverse or print without method
        System.out.println(cll.head.next.value);
        System.out.println(cll.head.next.next.value);
        System.out.println(cll.head.next.next.next.value);
        System.out.println(cll.head.next.next.next.next.value);
        System.out.println(cll.head.next.next.next.next.next.value);

        // traverse print with method
        cll.traverse();

    }
}
