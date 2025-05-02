class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minInd = 0;
        int minLen = strs[0].length();
        String res = "";
        for(int i = 0; i < strs.length; i++)
        {
            if(minLen > strs[i].length())
            {
                minLen = strs[i].length();
                minInd = i;
            }
        }
        String minWord = strs[minInd];
        for(int i = 0; i < minWord.length(); i++)
        {
            for(int j = 0; j < strs.length; j++)
            {
                if(minWord.charAt(i) != strs[j].charAt(i))
                {
                    return res;
                }
            }
            res = res + minWord.charAt(i);
        }
        return res;
    }
}