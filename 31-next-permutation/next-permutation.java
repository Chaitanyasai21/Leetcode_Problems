class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) return;

        int n = nums.length;
        // 1. Find pivot: first index from right where nums[i-1] < nums[i]
        int i = n - 1;
        while (i > 0 && nums[i - 1] >= nums[i]) {
            i--;
        }

        // If pivot exists (i > 0)
        if (i > 0) {
            int pivotIdx = i - 1;

            // 2. Find rightmost successor to pivot in suffix (nums[j] > nums[pivotIdx])
            int j = n - 1;
            while (nums[j] <= nums[pivotIdx]) {
                j--;
            }

            // 3. Swap pivot and successor
            swap(nums, pivotIdx, j);
        }

        // 4. Reverse the suffix starting at i
        reverse(nums, i, n - 1);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private void reverse(int[] a, int l, int r) {
        while (l < r) {
            swap(a, l++, r--);
        }
    }
}
