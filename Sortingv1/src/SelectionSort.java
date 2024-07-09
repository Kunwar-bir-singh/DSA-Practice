public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,2};
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }
    static void selectionSort(int []arr){
        for(int i = 0 ; i< arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]) swap(arr , j , i);
            }
        }
    }
    static void swap(int [] arr, int j, int i){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    static void printArray(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
