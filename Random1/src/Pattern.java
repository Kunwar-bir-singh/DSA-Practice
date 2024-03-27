public class Pattern {
    public static void main(String[] args) {
        pattern(10);
    }
    static void pattern(int n ){
        for(int row = 1; row <= n ; row ++){
            if(row > n/2){
                for(int col = 1;  col <= n-row ; col++){
                    System.out.print("*" + " ");
                }
            }
            else{
                for(int col = 1 ; col <= row ; col++) {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
}
