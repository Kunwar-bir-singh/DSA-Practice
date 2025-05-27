class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] ansArr = new int [k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));


        for(int i = 0 ; i < nums.length ; i++){
            int freq =  map.getOrDefault(nums[i] , 0);
            map.put(nums[i] , freq + 1);
        }

        for(int key : map.keySet()){
            que.add(key);
        }

        for(int i = 0 ; i < k ; i++){
            ansArr[i] = que.poll();
        }
        return ansArr;
    }
}