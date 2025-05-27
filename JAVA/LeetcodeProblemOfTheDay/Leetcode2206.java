class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0) return false;
        }
        return true;
    }
}