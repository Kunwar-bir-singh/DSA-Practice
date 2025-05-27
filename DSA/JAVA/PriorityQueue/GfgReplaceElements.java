class Solution {
    static int[] replaceWithRank(int arr[], int N) {
     // code here
        int [] ansArr = new int [N];
        HashMap <Integer, Integer> map = new HashMap<>();
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        
        for(int i : arr) pq.add(i);
        
        
        int index = 0;
        
        for(int i = 0 ; i < N ; i++){
            if(map.get(pq.peek()) == null){
                index++;
            }
           map.put(pq.poll() , index);

        }
        
        for(int i = 0 ; i < N ; i++){
            ansArr[i] = map.get(arr[i]);
        }      
        
        return ansArr;
  }
}