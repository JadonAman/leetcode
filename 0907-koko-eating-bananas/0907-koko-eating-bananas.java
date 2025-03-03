class Solution {

    public static int TotalH(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double) (v[i]) / (double) (hourly));
        }
        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for (int nums : piles) {
            if (nums > max) {
                max = nums;
            }
        }
        if (n == h)
            return max;

        int min = 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int hour = TotalH(piles, mid);
            if (hour > h) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return min;
    }
}