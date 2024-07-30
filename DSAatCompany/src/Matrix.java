public class Matrix {
    public static void main(String[] args) {
        int [][] arr =  {{1, 2, 3} ,
                         {4, 5, 6},
                         {7, 8, 9}};

        int [][] arr2 = {{7, 4, 1} ,
                         {8, 5, 2},
                         {6, 9, 3}};

        for(int i = 0 ;i < arr.length ; i++){
            for(int j = 0 ;j < arr.length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Rotated Array : ");
        for(int i = 0 ;i < arr.length ; i++){
            for(int j = 0 ;j < arr.length ; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
