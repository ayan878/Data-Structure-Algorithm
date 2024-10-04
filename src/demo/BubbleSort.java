package demo;

public class BubbleSort {

    public static void bubbleSort(int arr[],int n){
        boolean swapped;
        do{
            swapped=false;
            for (int i = 1; i < n; i++) {
                if(arr[i-1]>arr[i]){
                    int temp= arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                    swapped=true;
                }
            }
            n--;
        }while (swapped);
    }
    public static void main(String[] args) {
        int arr[]={7,4,1,8,5,2,9,6,3};
        int n= arr.length;
        bubbleSort(arr,n);
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
