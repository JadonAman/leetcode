class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int n = original.length;
        int low = bounds[0][0], high = bounds[0][1];

        for (int i = 1; i < n; i++) {
            int diff = original[i] - original[i - 1];
            int newLow = Math.max(bounds[i][0], low + diff);
            int newHigh = Math.min(bounds[i][1], high + diff);
            if (newLow > newHigh) return 0;
            low = newLow;
            high = newHigh;
        }
        return high - low + 1;
    }
}
