class Solution {
    public int lengthOfLongestSubstring(String s) {
        int  m = 0, maxLen = 0;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch) && mp.get(ch) >= m){
                m = mp.get(ch) + 1;
            }
            mp.put(ch,i); 
            maxLen = Math.max(maxLen,i - m + 1);
        }
        return maxLen;
    }
}