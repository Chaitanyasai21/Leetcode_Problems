class Solution {
    public int jump(int[] nums) {
        int n = 0, f = 0, j = 0;

        while (f < nums.length - 1) {
            int far = 0;
            for (int i = n; i <= f; i++) {
                far = Math.max(far, i + nums[i]);
            }
            n = f + 1;
            f = far;
            j++;
        }

        return j;
    }
}