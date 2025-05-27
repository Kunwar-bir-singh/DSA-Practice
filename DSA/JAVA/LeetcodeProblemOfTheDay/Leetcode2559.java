class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] prefixVowelString = new int [words.length];
        int [] ansArr = new int [queries.length];
        int sum = 0;

        for(int i = 0 ; i < words.length ; i++){

            String curr = words[i];
            char firstChar = curr.charAt(0);
            char lastChar = curr.charAt(curr.length() - 1);

            if(isVowel(firstChar, lastChar)){
                sum ++;
            }
            prefixVowelString[i] = sum;
        }

        for(int j = 0 ; j < queries.length ; j++){
            int firstIndex = queries[j][0];
            int secondIndex = queries[j][1];

            if(firstIndex == 0 && prefixVowelString[firstIndex] == 0){
                ansArr[j] = prefixVowelString[secondIndex] - prefixVowelString[firstIndex];
            }
            else{
                if(firstIndex != 0 && prefixVowelString[firstIndex] == prefixVowelString[firstIndex - 1]){
                    ansArr[j] = prefixVowelString[secondIndex] - prefixVowelString[firstIndex];
                }
                else{
                    ansArr[j] = prefixVowelString[secondIndex] - prefixVowelString[firstIndex] + 1;
                }
            }
        }
        return ansArr;
    }

    public static boolean isVowel(char a, char b){
        if( (a == 'a'  || a == 'e'  || a == 'i'  || a == 'o'  || a == 'u' ) 
         && (b == 'a'  || b == 'e'  || b == 'i'  || b == 'o'  || b == 'u' )) return true;
        return false;
    }
}