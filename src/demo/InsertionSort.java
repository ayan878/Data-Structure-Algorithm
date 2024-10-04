package demo;

public class InsertionSort {

        public static void insertionSort(int arr[]){

            for(int j=1;j<arr.length;j++){
                int key=arr[j];
                int i=j-1; //0
                while(i>=0 && arr[i]>key){
                    arr[i+1]=arr[i];
                    i--;
                }
                arr[i+1]=key;
            }
        }
        public static void main(String[] args) {
            int arr[]={7,4,1,8,5,2,9,6,3};
            insertionSort(arr);
            for(int ele:arr){

                System.out.print(ele);
            }
        }

}
