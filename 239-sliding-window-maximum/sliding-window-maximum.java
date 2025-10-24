class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1)
            return new int[] { nums[0] };
        TreeMap<Integer, Integer> ts = new TreeMap<>();
        int l = 0;
        for (int i = 0; i < k; i++) {
            ts.put(nums[i], ts.getOrDefault(nums[i], 0) + 1);
        }
        int[] ans = new int[nums.length - k + 1];
        int j = 0;
        ans[j] = ts.lastKey();
        j++;
        // System.out.println(ans[0]);
        for (int i = k; i < nums.length; i++) {
            ts.put(nums[i], ts.getOrDefault(nums[i], 0) + 1);
            ts.put(nums[i - k], ts.get(nums[i - k]) - 1);
            if (ts.get(nums[i - k]) == 0) {
                ts.remove(nums[i - k]);
            }
            ans[j] = ts.lastKey();
            j++;
        }
        return ans;
    }
}