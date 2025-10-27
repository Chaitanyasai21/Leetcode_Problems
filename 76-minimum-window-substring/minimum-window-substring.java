class Solution {
    public boolean valid(int[] text,int[] pattern){
        for(int i = 0; i < text.length; i++){
            if(text[i] < pattern[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int text[] = new int[123];
        int pattern[] = new int[123];

        for(int i = 0; i < t.length(); i++){
            pattern[t.charAt(i) - 65]++;
        }

        int min = Integer.MAX_VALUE;
        int l = 0,st = 0;
        for(int r = 0;r < s.length(); r++){
            text[s.charAt(r) - 65]++;

            while( valid(text,pattern) )
            {
                if( r - l + 1 < min )
                {
                    st = l;
                    min = r - l + 1;
                }
                text[s.charAt(l) - 65]--;
                l++;
            }

        }
        if(min == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(st,st + min);
    }

}