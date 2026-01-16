class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        final long MOD = 1000000007L;

        // If grid is already a square, biggest square uses full side
        if (m == n) {
            long side = n - 1;
            return (int) ((side * side) % MOD);
        }

        // Store all possible vertical distances between horizontal fences
        Set<Integer> hDiff = new HashSet<>();

        // Convert arrays to lists to add boundaries
        List<Integer> hList = new ArrayList<>();
        for (int x : hFences) hList.add(x);
        List<Integer> vList = new ArrayList<>();
        for (int x : vFences) vList.add(x);

        // Add boundary fences at position 1
        hList.add(1);
        vList.add(1);

        // Sort fence positions
        Collections.sort(hList);
        Collections.sort(vList);

        // Add boundary fences at the end of grid
        hList.add(m);
        vList.add(n);

        // Compute all possible heights between horizontal fences
        for (int i = 0; i < hList.size(); i++) {
            for (int j = i + 1; j < hList.size(); j++) {
                hDiff.add(hList.get(j) - hList.get(i));
            }
        }

        int maxSide = -1;

        // Check which vertical distances also exist in horizontal distances
        for (int i = 0; i < vList.size(); i++) {
            for (int j = i + 1; j < vList.size(); j++) {
                int val = vList.get(j) - vList.get(i);
                if (hDiff.contains(val)) {
                    maxSide = Math.max(maxSide, val);
                }
            }
        }

        // No possible square
        if (maxSide == -1) return -1;

        // Return max square area with modulo
        long area = (long) maxSide * maxSide;
        return (int) (area % MOD);
    }
}