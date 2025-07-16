class Pair {
    String str;
    int mut;

    Pair(String str, int mut) {
        this.str = str;
        this.mut = mut;
    }
}

class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        HashSet<String> set = new HashSet<>();

        for (String str : bank) {
            set.add(str);
        }

        if (!set.contains(endGene))
            return -1;

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(startGene, 0));

        while (!que.isEmpty()) {
            String currStr = que.peek().str;
            int currMut = que.peek().mut;
            que.poll();

            if (currStr.equals(endGene))
                return currMut;

            for (int i = 0; i < currStr.length(); i++) {
                
                StringBuilder temp = new StringBuilder(currStr);
                
                for (char ch = 'A'; ch <= 'Z'; ch++) {
                    temp.setCharAt(i, ch);
                    
                    if (set.contains(temp.toString())) {
                        set.remove(temp.toString());
                        que.add(new Pair(temp.toString(), currMut + 1));
                    }
                }
            }
        }
        return -1;
    }
}