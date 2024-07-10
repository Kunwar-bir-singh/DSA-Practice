public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {13 , 3 , 25 , 2 , 9 , 7};
        printArr(arr);
        insertionSort(arr);
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
    static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArr(int [] arr){
        System.out.print("Array Is : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    }