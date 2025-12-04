class Solution {
    public int countCollisions(String directions) {
        int total = 0;
        int potential = 0;

        char[] carArr = directions.toCharArray();

        for(int i = 0 ; i < carArr.length - 1; i++){
            char carA = carArr[i];
            char carB = carArr[i + 1];

            int collision = collisonCount(carA, carB); 
            
            if(collision != -1){
                if(collision == 0){
                    potential++;
                }
                else {
                    total = total +  collision + potential;
                    carArr[i + 1] = 'S';
                    potential = 0;
                }
            }
        }
        return total;
    }
    public int collisonCount(char carA, char carB){
        if(carA == 'R' && carB == 'L') return 2;
        if(carA == 'R' && carB == 'S') return 1;
        if(carA == 'S' && carB == 'L') return 1;
        if(carA == 'R' && carB == 'R') return 0;
        return -1;
    }
}