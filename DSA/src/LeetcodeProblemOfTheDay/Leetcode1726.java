class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Long, Integer> map = new HashMap<>();
        int ansCount = 0;

        for(int i = 0 ; i < nums.length - 1 ; i++){
            for (int j = i + 1 ; j < nums.length ; j++){
                long product = nums[i] * nums[j];
                
                int count = map.getOrDefault(product, 0);

                map.put(product, count + 1);
            }
        }
        for(int freq : map.values()){ 
            if( freq > 1){
                ansCount += 8 * ((freq * (freq - 1) ) / 2);
            }
        }
        return ansCount;
    }
}