class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length, count = 0, alternatingCount = 0;

        for (int i = 1; i < k; i++) {
            if (colors[i] != colors[i - 1]) alternatingCount++;
        }
        if (alternatingCount == k - 1) count++;

        for (int i = 1; i < n; i++) {
            if (colors[(i + k - 1) % n] != colors[(i + k - 2) % n]) alternatingCount++;
            if (colors[i] != colors[(i - 1) % n]) alternatingCount--;

            if (alternatingCount == k - 1) count++;
        }
        return count;
    }
}
