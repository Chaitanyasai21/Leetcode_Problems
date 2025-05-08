class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder s = new StringBuilder();
        char ch;
        int digit = 0;
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int res = 0, res2 = 0;

            if (i >= 0) {
                ch = num1.charAt(i);
                digit = ch - '0';
                res = digit;
                i--;
            }

            if (j >= 0) {
                ch = num2.charAt(j);
                digit = ch - '0';
                res2 = digit;
                j--;
            }

            int result = res + res2 + carry;
            carry = result / 10;
            result = result % 10;
            s.append(result);
        }

        String str = "";
        str = str + s.reverse().toString();
        return str;
    }
}
