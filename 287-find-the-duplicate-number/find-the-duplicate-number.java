class Solution {
    public int findDuplicate(int[] nums) {
        int size = nums.length-1;
        boolean [] freq = new boolean[size+1];
        for(int i = 0; i< size; i++){
            if(freq[nums[i]]){
                return nums[i];
            }
            else{
                freq[nums[i]] = true;
            }
        }
        return nums[size];
    }
}