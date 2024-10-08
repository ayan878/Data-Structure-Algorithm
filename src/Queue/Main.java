package Queue;

public class Main {

    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(5);
        boolean result = newQueue.isFull();
        System.out.println(result);
        boolean result1=newQueue.isEmpty();
        System.out.println(result1);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);
        int result3=newQueue.deQueue();
        System.out.println(result3);
        int result4 = newQueue.peek();
        System.out.println("Peek"+result4);



    }
}
