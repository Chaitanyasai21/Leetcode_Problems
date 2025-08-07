class Solution {
    public String addBinary(String a, String b) {
        if (a.equals("0") && b.equals("0")) {
            return "0";
        }
        if(b.length() > a.length())
            return addBinary(b,a);
        int diff = a.length() - b.length();
        String r = "";
        for(int i = 0; i < diff; i++){
            r += "0";
        }
        b = r+b;
        String s = "";
        int c = 0;
        for(int i = a.length() - 1; i >= 0; i--){
            int a1 = a.charAt(i) -'0';
            int b1 = b.charAt(i) - '0';
            int sum = a1 + b1 + c;
            s += (sum%2);
            c = sum / 2;
        }
        
        if(c == 1){
            s += "1";
        }
        String res = new StringBuilder(s).reverse().toString();
        return res;
    }
}