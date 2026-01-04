class Solution {
    public int sumFourDivisors(int[] nums) {
        int Sum = 0;

        for (int n : nums) {
            int Count = 0, inSum = 0;

            for (int d = 1; d * d <= n; d++) {
                if (n % d == 0) {
                    int other = n / d;

                    if (d == other) {
                        Count++;
                        inSum += d;
                    } else {
                        Count += 2;
                        inSum += d + other;
                    }

                    if (Count > 4)
                        break;
                }
            }

            if (Count == 4)
                Sum += inSum;
        }

        return Sum;
    }
}