class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int indexExists = -1;
        String[] splitArr = sentence.split(" ");        
        
        for(int i = 0 ; i < splitArr.length ; i++){
            String eachWord = splitArr[i];
            if(eachWord.startsWith(searchWord)) {
                indexExists = i +1;
                break;
            }
        }
        return indexExists;
    }
}