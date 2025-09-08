import java.util.HashMap;

class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        while (n != 1) {
            if (map.containsKey(n)) return false; // cycle detected
            map.put(n, true);

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return true;
    }
}
