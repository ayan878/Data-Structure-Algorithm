package demo;

public class SelectionSort {

    public static  void seletionSort(int arr[],int n){
        for (int i = 0; i < n-1; i++) {
            int minIndex=i;
            for (int j = i+1; j < n; j++) {
                    if(arr[minIndex]>arr[j]){
                        minIndex=j;
                    }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={7,4,1,8,5,2,9,6,3};
        int n= arr.length;
        seletionSort(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
