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
            int a1 = a.charAt(i) - '0';
            int b1 = b.charAt(i) - '0';
            if(a1 == 1 && b1 == 1){
                if(c == 1){
                    s += "1";
                }
                else{
                    s += "0";
                }
                c = 1;
            }
            else{
                if(a1 == 0 && b1 == 0){
                    if(c == 1){
                        s += "1";
                        c = 0;
                    }else{
                        s+="0";
                    }
                }else{
                    if(c == 1){
                        s += "0";
                    }else{
                        s += "1";
                        c = 0;
                    }
                }  
            }
        }
        if(c == 1){
            s += "1";
        }
        // System.out.println(s);
         String res = new StringBuilder(s).reverse().toString();
        // System.out.println(res);

        // int i = 0;
        // while (i < res.length() - 1 && res.charAt(i) == '0') {
        //     i++;
        // }
        // System.out.println(i);
        return res;
    }
}