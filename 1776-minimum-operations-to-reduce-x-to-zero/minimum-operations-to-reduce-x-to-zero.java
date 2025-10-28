class Solution {
    public int minOperations(int[] nums, int x) {
        int l = 0, totalSum = 0;
        int maxLen = 0;
        boolean found = false;
        for(int i : nums){
            totalSum += i;
        }
        int target = totalSum - x;
        int sum = 0;
        if(target < 0)
        {
            return -1;
        }
        if(target == 0){
            return nums.length;
        }
        for(int r = 0; r < nums.length; r++){
            sum += nums[r];
            while(sum > target){
                sum = sum - nums[l];
                l++;
            }
            if(sum == target && l <= r){
                found = true;
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }
        if(!found || x == 0){
            return -1;
        }
        return nums.length - maxLen;
    }
}