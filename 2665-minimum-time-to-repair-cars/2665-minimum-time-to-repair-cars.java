import java.util.Arrays;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);
        long low = 1, high = (long) ranks[0] * cars * cars;

        while (low < high) {
            long mid = low + (high - low) / 2;
            if (canRepairAll(ranks, cars, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canRepairAll(int[] ranks, int cars, long time) {
        int totalCars = 0;
        for (int rank : ranks) {
            totalCars += (long) Math.sqrt(time / rank);
            if (totalCars >= cars) return true;
        }
        return false;
    }
}
