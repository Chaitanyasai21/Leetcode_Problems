class Solution {
    public int[] plusOne(int[] ar) {
        for(int i = ar.length - 1; i >= 0; i--){
            ar[i] += 1;
            if(ar[i] <= 9){
                return ar;
            }
            ar[i] = 0;
        }
        int n = ar.length;
        int []ans = new int[n+1];
        ans[0] = 1;
        return ans;
    }
}