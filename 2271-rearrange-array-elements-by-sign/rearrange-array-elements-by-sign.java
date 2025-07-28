class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];
        int p = 0, n = 1;
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(val > 0){
                arr[p] = val;
                p = p + 2;
            }
            else{
                arr[n] = val;
                n = n + 2;
            }
        }
        return arr;
    }
}