class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int len = intervals.length;
        int newArr[][] = new int [len + 1][2];
        int index = 0;
        boolean flag = false;

        for(int i = 0 ; i <= len ; i++ ){
            if(len == 0){
                newArr[0] = newInterval;
                break;
            }
            if(flag == true){
                newArr[i] = intervals[index];
                index++;
            }
            else {
                if(index == len || newInterval[0] < intervals[index][0]){
                    newArr[i] = newInterval;
                    flag = true;
                }
                else {
                    newArr[i] = intervals[i];
                    index ++;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int start = newArr[0][0];
        int end = newArr[0][1];

        for(int i = 1 ; i < newArr.length ; i++){
            if(newArr[i][0] > end){
                list.add(start);
                list.add(end);
                start = newArr[i][0];
                end = newArr[i][1];
            }
            else {
                end = Math.max(end , newArr[i][1]);
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