//Solution in java

class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;

        int maxs=nums[0];
        int csum=nums[0];

        for(int i=1;i<n;i++){
            csum = ( nums[i] > csum+nums[i] ) ? nums[i] : csum+nums[i];
            
            maxs = csum>maxs? csum : maxs;
        }

        return maxs;
    }
}