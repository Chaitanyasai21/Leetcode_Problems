class Solution {
    public int trap(int[] height) {
        int trappedWater = 0, l = 0, r = height.length - 1;
        int leftMax = 0, rightMax = 0;
        if(height == null || height.length == 0){
            return trappedWater;
        }

        while(l < r){
            if(height[l] < height[r]){
                if(height[l] >= leftMax){
                    leftMax = height[l];
                } else {
                    trappedWater += leftMax - height[l];
                }
                l++;
            }
            else {
                if(height[r] >= rightMax){
                    rightMax = height[r];
                }
                else {
                    trappedWater += rightMax - height[r];
                }
                r--;
            }
        }
        return trappedWater;
    }
}