class Solution {
    public long pickGifts(int[] gifts, int k) {

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;

        for(int i : gifts) que.add(i);

        for(int j = 0 ; j < k ; j++){
            int maxElem = (int) Math.sqrt(que.poll());
            que.add(maxElem);
        }

        for(int num : que) sum += (long) num;

        return sum;
    }
}