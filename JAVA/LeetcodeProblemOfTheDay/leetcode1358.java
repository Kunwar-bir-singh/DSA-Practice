class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int ansCount = 0;

        while (j < s.length()) {

            if (isValid(map)) {
                ansCount += s.length() - j + 1;
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            } else {
                int charFreq = map.getOrDefault(s.charAt(j), 0);
                map.put(s.charAt(j), charFreq + 1);
                j++;
            }
        }

        while (i < s.length()) {
            if (isValid(map)) {
                ansCount++;
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            }
            i++;
        }
        return ansCount;
    }

    public static boolean isValid(HashMap<Character, Integer> map) {
        if (map.get('a') == null || map.get('b') == null || map.get('c') == null)
            return false;

        if (map.get('a') > 0 && map.get('b') > 0 && map.get('c') > 0)
            return true;
        return false;
    }
}