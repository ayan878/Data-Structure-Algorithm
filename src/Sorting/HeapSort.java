package Sorting;

public class HeapSort {

    public void heapify(int arr[],int n, int i){
        int largest=i;
        int left_child=2*i+1;
        int right_child=2*i+2;

        if(left_child < n && arr[left_child] > arr[largest]){
            largest=left_child;
        }
        if(right_child < n && arr[right_child] > arr[largest]){
            largest=right_child;
        }
       // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
    public void sort(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify root element
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int arr[]={7,4,1,8,5,2,9,6,3};
        HeapSort hs= new HeapSort();
        hs.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
