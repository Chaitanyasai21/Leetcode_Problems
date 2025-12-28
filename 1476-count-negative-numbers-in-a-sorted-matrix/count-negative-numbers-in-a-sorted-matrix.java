class Solution {
    public int countNegatives(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int i = r - 1;
        int j = 0;
        int res = 0;
        while(i >= 0 && j < c){
            if(grid[i][j] < 0){
                res += c - j;
                i--;
            }
            else {
                j++;
            }
        }
        return res;
    }
}