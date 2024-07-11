public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int arr[] ={13,46,24,52,20,9};
        System.out.println("Before Sorting : ");
        printArr(arr);
        recursiveBubble(arr, arr.length);
        System.out.println("After Sorting : ");
        printArr(arr);
    }

    static void recursiveBubble(int []arr , int n){
        if(n == 1) return;
        int didSwap = 0;
        for(int i = 0 ; i < n-1 ; i++){
            if(arr[i] > arr[i+1]) {
                swap(arr, i , i+1);
                didSwap = 1;
            }
        }
        if(didSwap == 0) return;
        recursiveBubble(arr , n-1);
    }
    static void printArr(int [] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}