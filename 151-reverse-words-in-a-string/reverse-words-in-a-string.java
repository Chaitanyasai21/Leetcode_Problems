class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String arr[] =  s.split(" ");
        s = "";
        for(int i = arr.length -1; i >= 0; i--){
            if (arr[i].length() == 0) continue;
            s += arr[i] + " ";
        }
        return s.trim(); 
    }
}