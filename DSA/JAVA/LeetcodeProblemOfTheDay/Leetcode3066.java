class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int ansCount = 0;

        for(int i : nums) pq.add((long) i);

        while(!pq.isEmpty()){
            if(pq.peek() >= k) break;

            long first = pq.remove();
            long second = pq.remove();

            long combined =  (first * 2) + second;
            ansCount++;
            pq.add(combined);
        }
        return ansCount;
    }
}