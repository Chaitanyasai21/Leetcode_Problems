import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No unique character
    }
}
