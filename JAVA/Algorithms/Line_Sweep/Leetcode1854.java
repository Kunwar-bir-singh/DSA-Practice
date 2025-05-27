class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101]; // years 1950 to 2050

        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        int maxYear = 1950;
        int currPopulation = 0;
        int maxPopulation = 0;

        for (int i = 0; i < years.length; i++) {
            currPopulation += years[i];
            if (currPopulation > maxPopulation) {
                maxPopulation = currPopulation;
                maxYear = 1950 + i;
            }
        }

        return maxYear;
    }
}
