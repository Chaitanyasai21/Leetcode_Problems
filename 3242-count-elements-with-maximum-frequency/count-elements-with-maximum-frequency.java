class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0) + 1);
        }
        int maxFreq = 0;
        for(int i : mp.values()){
            maxFreq = Math.max(i,maxFreq);
        }
        int res = 0;
        for(int i : mp.values()){
            if(i == maxFreq){
                res += i;
            }
        }
        return res;
    }
}