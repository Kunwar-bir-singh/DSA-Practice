class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;

        for(int i : nums) pq.add(i);

        for(int j = 0 ; j < k ; j++){
            ans = pq.poll();    
        }
        return ans;
    }
}