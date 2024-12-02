public static List<String> generateBinaryStrings(int n) {
        // code here
        List <String> ansList = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        helper(ansList, n, 0, curr);

        return ansList;
    }
    public static void helper(List <String> ansList, int n, int index, StringBuilder curr){
        if(index == n){
            ansList.add(curr.toString());
            return;
        }

        curr.append('0');
        helper(ansList, n, index + 1, curr);
        curr.deleteCharAt(curr.length() - 1);

        if(curr.isEmpty() || curr.charAt(index - 1) != '1'){
            curr.append('1');
            helper(ansList, n, index + 1, curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }