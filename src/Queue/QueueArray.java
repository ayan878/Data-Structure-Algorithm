package Queue;

public class QueueArray {

    int [] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr=new int[size];
        this.topOfQueue=-1;
        this.beginningOfQueue=-1;
        System.out.println("The Queue is is successfully created with size of:"+size);
    }
    public boolean isFull(){
        if(topOfQueue== arr.length-1){
            return  true;
        }
        return  false;
    }
    public boolean isEmpty(){
        if(topOfQueue== beginningOfQueue){
            return  true;
        }
        return  false;
    }

    public  void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted " +value+" in the queque");
        }
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        // Retrieve the item to be removed
        int result = arr[beginningOfQueue];
        // Move the beginningOfQueue forward
        beginningOfQueue++;
        // Check if the queue is now empty
        if (beginningOfQueue > topOfQueue) {
            // Reset the queue if it's empty
            beginningOfQueue = topOfQueue = -1;
        }
        return result;
    }
    public  int peek(){
        if(!isEmpty()){
            return  arr[beginningOfQueue];
        }else {
            System.out.println("The Queue is empty");
            return -1;
        }

    }

}
