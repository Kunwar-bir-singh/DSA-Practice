class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = -1;

        for(int num : arr){
            int freq = map.getOrDefault(num, 0);
            map.put(num, freq + 1);
        }

        for(Map.Entry<Integer,Integer> elem : map.entrySet()){
            if(elem.getKey() == elem.getValue()) ans = Math.max(ans, elem.getValue());
        }
        return ans;
    }
}