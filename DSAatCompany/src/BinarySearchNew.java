import java.util.*;

public class BinarySearchNew {
    public static void main(String[] args) {
        System.out.println(frequencySort("aabcb"));
    }

    public static String frequencySort(String s) {
        String ans = "";
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int value = map.get(c);
                map.put(c , ++value);
            }
            else map.put(c , 1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        Collections.reverse(entryList);
        System.out.println(entryList);

        for (Map.Entry<Character, Integer> entry : entryList) {
            ans = addString(ans ,  entry.getKey() ,  entry.getValue());
        }
        return ans;
    }
    static String addString(String ans , Character c, int reps){
        for(int i = 0 ; i < reps ; i++){
            ans += c;
        }
        return ans;
    }
}
