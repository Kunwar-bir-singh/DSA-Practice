class Leetcode2490 {
    public boolean isCircularSentence(String sentence) {
        String[] strArr = sentence.split(" ");
        String firstWord = strArr[0];
        String lastWord = strArr[strArr.length - 1];

        if(firstWord.charAt(0) != lastWord.charAt(lastWord.length()-1) ) return false;

        for(int i = 0 ; i < strArr.length-1 ; i++){
            char lastCharCW = strArr[i].charAt(strArr[i].length() - 1);
            char firstCharNW = strArr[i + 1].charAt(0);

            if (lastCharCW != firstCharNW) return false;
        }
        return true;
    }
}