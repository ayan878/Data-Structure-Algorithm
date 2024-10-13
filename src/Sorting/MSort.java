package Sorting;

public class MSort {

    public static void mergeSort(int arr[],int left,int right){
        int mid = left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public static void merge(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int L[]=new int[n1];
        int R[]= new int[n2];

        for (int i = 0; i <n1 ; i++) {
            L[i]=arr[left+i];
        }
        for (int j = 0; j <n2 ; j++) {
            R[j]=arr[mid+1+j];
        }

        L[n1] =Integer.MAX_VALUE;
        R[n2]=Integer.MAX_VALUE;

        int i=0;
        int j=0;
        int k=left;

        while (i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }else {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k]=L[left];
            i++;
            j++;
        }
        while (j<n2){
            arr[k]=R[j];
            i++;
            j++;
        }
    }
    public static  void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {15, 7, 12, 9, 5, 16, 6, 3, 8, 1};
        System.out.print("Original Array:");
        printArray(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.print("\nSorted Array:");
        printArray(arr);
    }
}
