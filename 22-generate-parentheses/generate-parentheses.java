class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int n) {
        // If the string is complete
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        // Add '(' if we still have remaining opens
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // Add ')' if close brackets are fewer than open brackets
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}
