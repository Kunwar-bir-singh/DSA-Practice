class Solution {
 public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
     int ans[] = new int [queries];
     
     for(int i = 0 ; i < queries ; i++){
         int count = 0;
         for(int j = indices[i] ; j < N-1 ; j++ ){
             if(arr[indices[i]] < arr[j+1]){
                 count ++;
             }
         }
        ans[i] = count;
     }
     return ans;
  }
}
     