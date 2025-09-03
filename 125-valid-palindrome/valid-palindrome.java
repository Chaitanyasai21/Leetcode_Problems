class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().trim();

        int st = 0, e = s.length() - 1;
        boolean res = true;

        while (st <= e) {
            if (!Character.isLetterOrDigit(s.charAt(st))) {
                st++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(e))) {
                e--;
            }
            else {
                if (s.charAt(st) == s.charAt(e)) {
                    st++;
                    e--;
                } else {
                    res = false;
                    break;
                }
            }
        }
        return res; // ✅ empty string or only spaces → while never runs → returns true
    }
}
