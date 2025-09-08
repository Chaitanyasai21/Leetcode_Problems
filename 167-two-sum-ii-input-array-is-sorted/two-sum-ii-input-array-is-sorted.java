class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;                  // start pointer
        int right = numbers.length - 1; // end pointer

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based indices
            } else if (sum < target) {
                left++;  // need a bigger sum
            } else {
                right--; // need a smaller sum
            }
        }

        return new int[]{-1, -1}; 
    }
}
