class Pair {
    String str;
    int length;

    Pair(String str, int length) {
        this.str = str;
        this.length = length;
    }
}


class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();

        for (String str : wordList) {
            set.add(str);
        }

        if (!set.contains(endWord))
            return 0;

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(beginWord, 1));

        while (!que.isEmpty()) {
            String currStr = que.peek().str;
            int currlength = que.peek().length;
            que.poll();

            if (currStr.equals(endWord))
                return currlength;

            for (int i = 0; i < currStr.length(); i++) {
                
                StringBuilder temp = new StringBuilder(currStr);
                
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    temp.setCharAt(i, ch);
                    
                    if (set.contains(temp.toString())) {
                        set.remove(temp.toString());
                        que.add(new Pair(temp.toString(), currlength + 1));
                    }
                }
            }
        }
        return 0;
    }
}