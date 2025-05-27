class Solution {
    public List<String> stringMatching(String[] words) {
        List <String> ansList = new ArrayList<>();

        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < words.length ; j++){
                String ithWord = words[i];
                String jthWord = words[j];

                if(j == i || ithWord.length() > jthWord.length() ) continue;

                if(jthWord.contains(ithWord)) {
                    ansList.add(ithWord);
                    break;
                }
            }
        }
        return ansList;       
    }
}