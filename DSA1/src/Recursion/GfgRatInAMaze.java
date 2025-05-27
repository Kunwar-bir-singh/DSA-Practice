//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline character

        while (t-- > 0) {
            String input = sc.nextLine();

            // Replace ][ with ],[
            input = input.replace("][", "],[");

            ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
            String[] rows = input.split("],\\s*\\[");

            for (String row : rows) {
                row = row.replaceAll("[\\[\\]]", ""); // Remove any surrounding brackets
                ArrayList<Integer> intRow = new ArrayList<>();
                for (String num : row.split(",")) {
                    intRow.add(Integer.parseInt(num.trim()));
                }
                mat.add(intRow);
            }

            Solution obj = new Solution();
            ArrayList<String> result = obj.findPath(mat);

            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (String res : result) {
                    System.out.print(res + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java



// User function Template for Java

class Solution {
    // Function to find all possible paths
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here
        ArrayList<String> ansList = new ArrayList<>();

        boolean visited[][] = new boolean [mat.size()][mat.get(0).size()];
        findPaths(mat, ansList, visited, "", 0 , 0);
        
        
        return ansList;
    }
    
    public void findPaths(ArrayList<ArrayList<Integer>> mat, List<String> ansList, 
        boolean visited[][], String currPath, int row, int column){
        
        if(row == mat.size() - 1 && column == mat.get(row).size() - 1){
            ansList.add(currPath);
            return;
        }
            
        if(row == mat.size() || column == mat.get(row).size() || mat.get(row).get(column) == 0 || visited[row][column]){
            return;
        }
        
        visited[row][column] = true;
        
        if(row < mat.size()){
            
            findPaths(mat, ansList, visited, currPath + 'D', row + 1 , column );
        }
        
        if(column > 0){
            findPaths(mat, ansList, visited, currPath + 'L', row  , column - 1 );
        }
        
        if(column < mat.get(row).size()){
            
            findPaths(mat, ansList, visited, currPath + 'R', row , column + 1);
        }
        
        if(row > 0){
            findPaths(mat, ansList, visited, currPath + 'U', row - 1  , column );
        }
        
        visited[row][column] = false;


    }
}