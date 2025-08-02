class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int pos = nums.length - 1;
        int res[] = new int[nums.length];
        while(l <= r){
            int left = nums[l] * nums[l];
            int right = nums[r] * nums[r];
            if(right > left){
                res[pos] = right;
                r--;
            }
            else{
                res[pos] = left;
                l++;
            }
            pos--;
        }
       return res; 
    }
}