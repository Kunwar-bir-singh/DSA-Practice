Longest Common Substring



Difficulty: MediumAccuracy: 42.69%Submissions: 278K+Points: 4

You are given two strings s1 and s2. Your task is to find the length of the longest common substring among the given strings.





class Solution {

    public int longestCommonSubstr(String s1, String s2) {

        // code here

        int memo[][] = new int[s1.length()][s2.length()];

        

        for(int arr [] : memo){

            Arrays.fill(arr, -1);

        }

        

        return recur(s1, s2, memo, 0,0);

    }

    public static int recur(String s1, String s2, int memo[][], int index1, int index2 ){

        if(index1 == s1.length() || index2 == s2.length() ){

            return 0 ;

        }

        

        int match = 0;

        int notMatch = 0;

        

        if(memo[index1][index2] != -1 ) return memo[index1][index2];

        

        if(s1.charAt(index1) == s2.charAt(index2) ){

            match = 1 + recur(s1, s2, memo, index1 + 1, index2 + 1);

        }

        

         notMatch = Math.max(recur(s1, s2, memo, index1 + 1, index2 ),

                                recur(s1, s2, memo, index1, index2 + 1 ));

         

        return memo[index1][index2] = Math.max(match, notMatch);

    }

}   



why is this logic wrong