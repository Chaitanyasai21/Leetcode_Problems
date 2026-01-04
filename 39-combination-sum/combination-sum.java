
class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(nums, target, 0, 0, new ArrayList<>(), answer);
        return answer;
    }

    private void backtrack(
            int[] nums,
            int target,
            int start,
            int currentSum,
            List<Integer> path,
            List<List<Integer>> answer
    ) {
        // Base case: valid combination found
        if (currentSum == target) {
            answer.add(new ArrayList<>(path));
            return;
        }

        // Stop if sum exceeds target
        if (currentSum > target) {
            return;
        }

        // Explore candidates from current index
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, target, i, currentSum + nums[i], path, answer);
            path.remove(path.size() - 1); // backtrack
        }
    }
}
