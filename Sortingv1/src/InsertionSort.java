public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {13 , 3 , 25 , 2 , 9 , 7};
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }

    void insertionSort(int [] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1 ; j>0 ; j--){
                if(arr[j] > arr[j+1]) swap(arr, j, j+1);
                else break;
            }
        }
    }
    void swap(int arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void printArr(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Array Is : ", arr[i]);
        }
    }
}