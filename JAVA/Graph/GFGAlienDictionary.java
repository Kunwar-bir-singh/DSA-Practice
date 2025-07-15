
class Solution {
  public String findOrder(String[] words) {

        Map<Character, Integer> inDegree = new HashMap<>();
        Map<Character, List<Character>> adj = new HashMap<>();
        Queue<Character> que = new LinkedList<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                inDegree.putIfAbsent(c, 0);
                adj.putIfAbsent(c, new ArrayList<>());
            }
        }

        for(int i = 0 ; i < words.length - 1 ; i++) {
            int j = 0;
            int k = 0;

            String strj = words[i];
            String strk = words[i + 1];

            if(strj.length() > strk.length() && strj.startsWith(strk)) return "";

            while (j < strj.length() && k < strk.length()) {
                char jth = strj.charAt(j);
                char kth = strk.charAt(k);

                if (jth != kth) {
                    if (!adj.get(jth).contains(kth)) {
                        adj.get(jth).add(kth);
                        inDegree.put(kth, inDegree.get(kth) + 1);
                    }
                break;

                }
                k++;
                j++;
            }
        }

        for(Map.Entry<Character, Integer> entry : inDegree.entrySet()){
            char currCh = entry.getKey();
            int degree = entry.getValue();
            if( degree == 0) {
                que.add(currCh);
            }
        }

        return BFS(inDegree, adj, que);

    }
        public static String BFS( Map<Character, Integer> map, Map<Character, List<Character>> adj, Queue<Character> que  ){
            StringBuilder ans =  new StringBuilder();

            while(!que.isEmpty()){
                char currCh = que.poll();
                ans.append(currCh);

                for(char neighbour : adj.get(currCh)){
                        int inDegree = map.get(neighbour) - 1;
                        map.put(neighbour, inDegree);
                        if(inDegree == 0) que.add(neighbour);
                }
            }
           return ans.length() == map.size() ? ans.toString() : "";
        }
}