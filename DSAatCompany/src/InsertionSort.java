public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {13 , 3 , 25 , 2 , 9 , 7};
        System.out.println("Array Before Sorting : ");
        printArr(arr);
//        insertionSort(arr);
        RecurInsertionSort(arr , 1 , arr.length);
        System.out.println("Array After Sorting");
        printArr(arr);
    }

    static void insertionSort(int [] arr){
        for(int i = 1 ; i < arr.length ; i++){
            int j = i;
            while(j > 0){
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    j--;
                }
                else break;
            }
        }
    }
    static void RecurInsertionSort(int [] arr , int i , int n){
        if( i == n) return;
        int j = i;
            while(j > 0){
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    j--;
                }
                else break;
            }
        RecurInsertionSort(arr , ++i , n);
//        RecurInsertionSort(arr , i++ , n);
    }

    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArr(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    }