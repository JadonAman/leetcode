import java.util.HashMap;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int repeat = -1, missing = -1;
        HashMap<Integer, Integer> hmp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = grid[i][j];
                hmp.put(temp, hmp.getOrDefault(temp, 0) + 1);
            }
        }

        
        for (int i = 1; i <= n * n; i++) {
            int count = hmp.getOrDefault(i, 0);
            if (count == 0) {
                missing = i; 
            } else if (count == 2) {
                repeat = i; 
            }
        }

        return new int[]{repeat, missing};
    }
}
