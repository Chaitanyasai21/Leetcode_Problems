class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        int low = 0, high = minLen;
        while (low <= high) {
            int mid = (low + high) / 2;

            String prefix = strs[0].substring(0, mid);
            boolean common = true;
            for (int i = 1; i < strs.length; i++) {
                if (!strs[i].startsWith(prefix)) {
                    common = false;
                    break;
                }
            }

            if (common) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }
}
