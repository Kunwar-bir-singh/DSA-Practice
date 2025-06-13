class Solution {
    int maxLen(int arr[]) {
        // code here
        int prefixSum[] = new int [arr.length];
        Map<Integer, Integer> map = new HashMap<>();
        
        int maxLen = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(i == 0){
                 map.put(arr[0] , 0);
                 prefixSum[0] = arr[0];
            }
            if(i > 0) prefixSum[i] = prefixSum[i - 1] + arr[i];
                
            if(prefixSum[i] == 0) maxLen = Math.max(maxLen , (i + 1 ) );
            
            else if(map.containsKey(prefixSum[i])){
                maxLen = Math.max(maxLen , (i - map.get(prefixSum[i])));
            }
            else map.put(prefixSum[i], i);
        }
        return maxLen;
        
    }
}