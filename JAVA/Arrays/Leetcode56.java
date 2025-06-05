class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<Integer> list = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1 ; i < intervals.length ; i++){
            if(intervals[i][0] > end){
                list.add(start);
                list.add(end);
                start = intervals[i][0];
                end = intervals[i][1];
            }
            else {
                end = Math.max(end , intervals[i][1]);
            }
        }
        list.add(start);
        list.add(end);
        System.out.println(list);

        int ans[][] = new int [list.size() / 2][2];
        int var = 0;
        for(int i = 0 ; i < ans.length ; i++){
            ans[i][0] = list.get(var);
            ans[i][1] = list.get(var+1);
            var +=2;
        }
        return ans;  
    }
}