class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Create a copy for rearranging
        int[] copy = nums.clone();

        int mid = (n - 1) / 2; // end of first half
        int end = n - 1;       // end of second half

        // Step 3: Place numbers in wiggle order
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = copy[mid--]; // smaller half in even indices
            } else {
                nums[i] = copy[end--]; // larger half in odd indices
            }
        }
    }
    
}