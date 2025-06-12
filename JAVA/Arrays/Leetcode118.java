class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ansList.add(new ArrayList<>());
            ansList.get(i).add(1);
        }

        int currListLen = 2;

        for (int i = 1; i < ansList.size(); i++) {

            for (int j = 1; j < currListLen; j++) {
                if (j == currListLen - 1) {
                    ansList.get(i).add(1);
                    break;
                }

                int oneUp = ansList.get(i - 1).get(j);
                int oneUpBack = ansList.get(i - 1).get(j - 1);

                ansList.get(i).add(oneUp + oneUpBack);
            }
            currListLen++;
        }

        return ansList;
    }
}