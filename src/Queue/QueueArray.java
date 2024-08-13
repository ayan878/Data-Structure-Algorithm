package Queue;

public class QueueArray {

    int [] arr;
    int topQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr=new int[size];
        this.topQueue=-1;
        this.beginningOfQueue=-1;
        System.out.println("The Queue is is successfully created with size of:"+size);
    }
    public boolean isFull(){
        if(topQueue== arr.length-1){
            return  true;
        }
        return  false;
    }
}
