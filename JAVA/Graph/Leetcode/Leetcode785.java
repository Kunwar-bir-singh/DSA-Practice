class Pair {
    int node;
    char color;

    Pair(int node, char color) {
        this.node = node;
        this.color = color;
    }
}

class Solution {
    public boolean isBipartite(int[][] graph) {
        int len = graph.length;
        HashMap<Integer, Character> map = new HashMap<>();

        for (int index = 0; index < len; index++) {
            if (!map.containsKey(index)) {
                Queue<Pair> que = new LinkedList<>();
                que.add(new Pair(index, 'R'));
                map.put(index, 'R');

                while (!que.isEmpty()) {
                    int currNode = que.peek().node;
                    char currColor = que.peek().color;
                    que.poll();

                    for (int i = 0; i < graph[currNode].length; i++) {
                        int childNode = graph[currNode][i];
                        char childColor = currColor == 'R' ? 'B' : 'R';

                        if (map.containsKey(childNode)) {
                            childColor = map.get(childNode);
                            if (childColor == currColor)
                                return false;
                        } else {
                            que.add(new Pair(childNode, childColor));
                            map.put(childNode, childColor);
                        }
                    }
                }
            }
        }
        return true;
    }
}