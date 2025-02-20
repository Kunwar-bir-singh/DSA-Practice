class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i], i);
        }

        for(int j = 0 ; j < arr.length ; j++){
            if (map.containsKey(arr[j] * 2) && map.get(arr[j] * 2) != j) return true;
        }
        return false;
    }
}